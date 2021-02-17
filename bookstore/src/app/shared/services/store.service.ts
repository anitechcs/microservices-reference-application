import { throwError as observableThrowError, Observable } from 'rxjs';
import { Injectable } from '@angular/core';
import { BooksDB } from '../mock-data/books';
import { OrdersDB } from '../mock-data/orders';
import { Book } from '../models/book.model';
import { Order } from '../models/order.model';
import { FormGroup } from '@angular/forms';
import { of, combineLatest } from 'rxjs';
import { startWith, debounceTime, delay, map, switchMap } from 'rxjs/operators';
import { CartItem } from '../models/cart.model';
import { GenreDB } from '../mock-data/genres';

@Injectable()
export class StoreService {
  public books: Book[] = [];
  public orders: Order[] = [];
  public initialFilters = {
    minPrice: 10,
    maxPrice: 500,
    minRating: 1,
    maxRating: 5
  };

  public cart: CartItem[] = [];
  public cartData = {
    itemCount: 0
  };

  constructor() { }
  
  public getCart(): Observable<CartItem[]> {
      return of(this.cart);
  }

  public addToCart(cartItem: CartItem): Observable<CartItem[]> {
    let index = -1;
    this.cart.forEach((item, i) => {
      if (item.book.bookId === cartItem.book.bookId) {
        index = i;
      }
    });
    if (index !== -1) {
      this.cart[index].data.quantity += cartItem.data.quantity;
      this.updateCount();
      return of(this.cart);
    } else {
      this.cart.push(cartItem);
      this.updateCount();
      return of(this.cart);
    }
  }

  private updateCount() {
    this.cartData.itemCount = 0;
    this.cart.forEach(item => {
      this.cartData.itemCount += item.data.quantity;
    });
  }

  public removeFromCart(cartItem: CartItem): Observable<CartItem[]> {
    this.cart = this.cart.filter(item => {
      if (item.book.bookId === cartItem.book.bookId) {
        return false;
      }
      return true;
    });
    this.updateCount();
    return of(this.cart);
  }

  public getBooks(): Observable<Book[]> {
    const booksDB = new BooksDB();
    return of(booksDB.books)
      .pipe(
        delay(500),
        map((data: Book[]) => {
          this.books = data;
          return data;
        })
      );
  }

  public getBookDetails(bookId: number): Observable<Book> {
    const booksDB = new BooksDB();
    const books = booksDB.books.filter(p => p.bookId == bookId)[0];
    if (!books) {
      return observableThrowError(new Error('Book not found!'));
    }
    return of(books);
  }

  public getGenres(): Observable<any> {
    const genreDB = new GenreDB();
    return of(genreDB.genres);
  }

  public getFilteredBook(filterForm: FormGroup): Observable<Book[]> {
    return combineLatest(
      this.getBooks(),
      filterForm.valueChanges
      .pipe(
        startWith(this.initialFilters),
        debounceTime(400)
      )
    )
    .pipe(
      switchMap(([books, filterData]) => {
        return this.filterBooks(books, filterData);
      })
    );
  }

  /*
  * If your data set is too big this may raise performance issue.
  * You should implement server side filtering instead.
  */
  private filterBooks(books: Book[], filterData: any): Observable<Book[]> {
    const filteredBooks = books.filter(book => {
      const match = {
        search: false,
        genre: false,
        price: false,
        rating: false
      };
      // Search
      if (!filterData.search || book.title.toLowerCase().indexOf(filterData.search.toLowerCase()) > -1 || book.description.indexOf(filterData.search) > -1 || book.tags.indexOf(filterData.search) > -1) {
        match.search = true;
      } else {
        match.search = false;
      }
      // Category filter
      if (book.genres.includes(filterData.genre) || !filterData.genre || filterData.genre === 'all') {
        match.genre = true;
      } else {
        match.genre = false;
      }
      // Price filter
      if (book.price.amount >= filterData.minPrice && book.price.amount <= filterData.maxPrice) {
        match.price = true;
      } else {
        match.price = false;
      }
      // Rating filter
      if (book.ratings.rating >= filterData.minRating && book.ratings.rating <= filterData.maxRating) {
        match.rating = true;
      } else {
        match.rating = false;
      }

      for (const m in match) {
        if (!match[m]) { 
          return false; 
        }
      }

      return true;
    });
    
    return of(filteredBooks);
  }

  public getOrders(): Observable<Order[]> {
    const ordersDB = new OrdersDB();
    return of(ordersDB.orders)
    .pipe(
      delay(500), 
      map((data: Order[]) => {
        this.orders = data;
        return data;
      })
    );
  }

  public getOrderDetails(orderId: number): Observable<Order> {
    const ordersDB = new OrdersDB();
    const orders = ordersDB.orders.filter(order => order.orderId == orderId)[0];
    if (!orders) {
      return observableThrowError(new Error('Order not found!'));
    }
    return of(orders);
  }

}