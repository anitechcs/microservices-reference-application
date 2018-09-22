import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { AppAnimations } from '../../shared/animations/animations';
import { ShopService } from '../../shared/services/shop.service';
import { MatSnackBar } from '@angular/material';
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
  public productID;
  public book: Book;
  public quantity = 1;
  public cart: CartItem[];
  public cartData: any;
  private productSub: Subscription;

  public photoGallery: any[] = [{url: '', state: '0'}];
  constructor(
    private shopService: ShopService,
    private route: ActivatedRoute,
    private snackBar: MatSnackBar
  ) { }

  ngOnInit() {
    this.productID = this.route.snapshot.params['id'];
    this.getProduct(this.productID);
    this.getCart();
    this.cartData = this.shopService.cartData;
  }

  ngOnDestroy() {
    this.productSub.unsubscribe();
  }

  getProduct(id) {
    this.productSub = this.shopService.getProductDetails(id)
    .subscribe(res => {
      this.book = res;
      this.initGallery(this.book);
    }, err => {
      this.book = {
        _id: '',
        name: '',
        price: { sale: 0 }
      };
    });
  }

  getCart() {
    this.shopService
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

    this.shopService
    .addToCart(cartItem)
    .subscribe(res => {
      this.cart = res;
      this.quantity = 1;
      this.snackBar.open('Book added to cart', 'OK', { duration: 4000 });
    });
  }

  initGallery(book: Book) {
    if (!book.gallery) {
      return;
    }
    this.photoGallery = book.gallery.map(i => {
      return {
        url: i,
        state: '0'
      };
    });
    if (this.photoGallery[0])  {
      this.photoGallery[0].state = '1';
    }
  }

  changeState(photo) {
    if (photo.state === '1') {
      return;
    }
    this.photoGallery = this.photoGallery.map(p => {
      if (photo.url === p.url) {
        setTimeout(() => {
          p.state = '1';
          return p;
        }, 290);
      }
      p.state = '0';
      return p;
    });
  }

}
