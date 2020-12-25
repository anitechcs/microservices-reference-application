import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { AppAnimations } from '../../shared/animations/animations';
import { StoreService } from '../../shared/services/store.service';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Book } from '../../shared/models/book.model';
import { Subscription } from 'rxjs';
import { CartItem } from '../../shared/models/cart.model';

@Component({
  selector: 'app-book-details',
  templateUrl: './book-details.component.html',
  styleUrls: ['./book-details.component.scss'],
  animations: AppAnimations
})
export class BookDetailsComponent implements OnInit, OnDestroy {
  public bookID: number = 0;
  public book!: Book;
  public quantity = 1;
  public cart!: CartItem[];
  public cartData: any;
  private bookSub!: Subscription;

  constructor(
    private storeService: StoreService,
    private route: ActivatedRoute,
    private snackBar: MatSnackBar
  ) { }

  ngOnInit() {
    this.bookID = this.route.snapshot.params['bookId'];
    this.getBook(this.bookID);
    this.getCart();
    this.cartData = this.storeService.cartData;
  }

  ngOnDestroy() {
    this.bookSub.unsubscribe();
  }

  getBook(bookId: number) {
    this.bookSub = this.storeService.getBookDetails(bookId)
    .subscribe(res => {
      this.book = res;
    }, err => {
      this.book = {
        bookId: 0,
        title: '',
        authors: [],
        isbn: '',
        language: 'English',
        publicationDate: '',
        publisher: '',
        totalPages: 0,
        coverPhoto: '',
        genres: [],
        price: { currency: 'USD', amount: 0 }
      };
    });
  }

  getCart() {
    this.storeService
    .getCart()
    .subscribe(cart => {
      this.cart = cart;
    });
  }

  addToCart() {
    const cartItem: CartItem = {
      book: this.book,
      data: {
        quantity: this.quantity,
        options: {}
      }
    };

    this.storeService
    .addToCart(cartItem)
    .subscribe(res => {
      this.cart = res;
      this.quantity = 1;
      this.snackBar.open('Book added to cart', 'OK', { duration: 4000 });
    });
  }

}
