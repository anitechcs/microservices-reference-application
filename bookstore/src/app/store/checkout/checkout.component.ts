import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { StoreService } from '../../shared/services/store.service';
import { AppAnimations } from '../../shared/animations/animations';
import { CartItem } from '../../shared/models/cart.model';

@Component({
  selector: 'app-checkout',
  templateUrl: './checkout.component.html',
  styleUrls: ['./checkout.component.scss'],
  animations: AppAnimations
})
export class CheckoutComponent implements OnInit {
  public cart: CartItem[];
  public checkoutForm: FormGroup;

  public total: number = 0;
  public subTotal: number = 0;
  public vat = 15;
  public shipping: any = 'Free';
  public paymentMethod: string = '';

  constructor(
    private fb: FormBuilder,
    private storeService: StoreService
  ) { }

  ngOnInit() {
    this.getCart();
    this.buildCheckoutForm();
  }

  calculateCost() {
    this.subTotal = 0;
    this.cart.forEach(item => {
      this.subTotal += (item.book.price.sale * item.data.quantity);
    });
    this.total = this.subTotal + (this.subTotal * (15 / 100));
    if (this.shipping !== 'Free') {
      this.total += this.shipping;
    }
  }

  getCart() {
    this.storeService
    .getCart()
    .subscribe(cart => {
      this.cart = cart;
      this.calculateCost();
    });
  }

  buildCheckoutForm() {
    this.checkoutForm = this.fb.group({
      firstName: ['', Validators.required],
      lastName: ['', Validators.required],
      address1: ['', Validators.required],
      city: ['', Validators.required],
      zip: ['', Validators.required],
      phone: ['', Validators.required],
      email: ['', Validators.required]
    });
  }


  placeOrder() {
    const shippingAddress = this.checkoutForm.value;
  }

}
