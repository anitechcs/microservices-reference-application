import { throwError as observableThrowError,  Observable } from 'rxjs';
import { Injectable } from '@angular/core';
import { ProductDB } from '../fake-db/products';
import { Product } from '../models/product.model';
import { FormGroup } from '@angular/forms';
import { of, combineLatest } from 'rxjs';
import { startWith, debounceTime, delay, map, switchMap } from 'rxjs/operators';
import { CartItem } from '../models/cart.model';


@Injectable()
export class ShopService {
  public products: Product[] = [];
  public initialFilters = {
    minPrice: 10,
    maxPrice: 40,
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
      if (item.product._id === cartItem.product._id) {
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
      if (item.product._id === cartItem.product._id) {
        return false;
      }
      return true;
    });
    this.updateCount();
    return of(this.cart);
  }
  public getProducts(): Observable<Product[]> {
    const productDB = new ProductDB();
    return of(productDB.products)
      .pipe(
        delay(500),
        map((data: Product[]) => {
          this.products = data;
          return data;
        })
      );
  }
  public getProductDetails(productID): Observable<Product> {
    const productDB = new ProductDB();
    const product = productDB.products.filter(p => p._id === productID)[0];
    if (!product) {
      return observableThrowError(new Error('Product not found!'));
    }
    return of(product);
  }
  public getCategories(): Observable<any> {
    const categories = ['speaker', 'headphone', 'watch', 'phone'];
    return of(categories);
  }

  public getFilteredProduct(filterForm: FormGroup): Observable<Product[]> {
    return combineLatest(
      this.getProducts(),
      filterForm.valueChanges
      .pipe(
        startWith(this.initialFilters),
        debounceTime(400)
      )
    )
    .pipe(
      switchMap(([products, filterData]) => {
        return this.filterProducts(products, filterData);
      })
    );

  }
  /*
  * If your data set is too big this may raise performance issue.
  * You should implement server side filtering instead.
  */
  private filterProducts(products: Product[], filterData): Observable<Product[]> {
    const filteredProducts = products.filter(p => {
      const match = {
        search: false,
        caterory: false,
        price: false,
        rating: false
      };
      // Search
      if (
        !filterData.search
        || p.name.toLowerCase().indexOf(filterData.search.toLowerCase()) > -1
        || p.description.indexOf(filterData.search) > -1
        || p.tags.indexOf(filterData.search) > -1
      ) {
        match.search = true;
      } else {
        match.search = false;
      }
      // Category filter
      if (
        filterData.category === p.category
        || !filterData.category
        || filterData.category === 'all'
      ) {
        match.caterory = true;
      } else {
        match.caterory = false;
      }
      // Price filter
      if (
        p.price.sale >= filterData.minPrice
        && p.price.sale <= filterData.maxPrice
      ) {
        match.price = true;
      } else {
        match.price = false;
      }
      // Rating filter
      if (
        p.ratings.rating >= filterData.minRating
        && p.ratings.rating <= filterData.maxRating
      ) {
        match.rating = true;
      } else {
        match.rating = false;
      }

      for (const m in match) {
        if (!match[m]) { return false; }
      }

      return true;
    });
    return of(filteredProducts);
  }
}
