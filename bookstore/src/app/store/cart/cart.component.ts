import { Component, OnInit } from '@angular/core';
import { StoreService } from '../../shared/services/store.service';
import { AppAnimations } from '../../shared/animations/animations';
import { CartItem } from '../../shared/models/cart.model';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.scss'],
  animations: [AppAnimations]
})
export class CartComponent implements OnInit {
  public cart!: CartItem[];
  public total: number = 0;
  public subTotal: number = 0;
  public vat = 15;
  
  constructor(
    private storeService: StoreService
  ) { }

  ngOnInit() {
    this.getCart();
    this.onQuantityChange();
  }

  getCart() {
    this.storeService
    .getCart()
    .subscribe(cart => {
      this.cart = cart;
    });
  }

  removeBook(cartItem) {
    this.storeService
    .removeFromCart(cartItem)
    .subscribe(res => {
      this.cart = res;
    });
  }

  onQuantityChange() {
    this.subTotal = 0;
    this.cart.forEach(item => {
      this.subTotal += (item.book.price.amount * item.data.quantity);
    });
    this.total = this.subTotal + (this.subTotal * (15 / 100));
  }

}
