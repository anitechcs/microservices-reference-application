import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { CountryDB } from '../../shared/fake-db/countries';
import { ShopService } from '../../shared/services/shop.service';
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
  public checkoutFormAlt: FormGroup;
  public hasAltAddress: boolean;
  public countries: any[];

  public total: number;
  public subTotal: number;
  public vat: number = 15;
  public shipping: any = 'Free';
  public paymentMethod: string;

  constructor(
    private fb: FormBuilder,
    private shopService: ShopService
  ) {
    const countryDB = new CountryDB();
    this.countries = countryDB.countries;
  }

  ngOnInit() {
    this.getCart();
    this.buildCheckoutForm();
  }
  calculateCost() {
    this.subTotal = 0;
    this.cart.forEach(item => {
      this.subTotal += (item.product.price.sale * item.data.quantity);
    });
    this.total = this.subTotal + (this.subTotal * (15 / 100));
    if (this.shipping !== 'Free') {
      this.total += this.shipping;
    }
  }
  getCart() {
    this.shopService
    .getCart()
    .subscribe(cart => {
      this.cart = cart;
      this.calculateCost();
    });
  }
  buildCheckoutForm() {
    this.checkoutForm = this.fb.group({
      country: ['', Validators.required],
      firstName: ['', Validators.required],
      lastName: ['', Validators.required],
      company: [],
      address1: ['', Validators.required],
      address2: [],
      city: ['', Validators.required],
      zip: ['', Validators.required],
      phone: ['', Validators.required],
      email: ['', Validators.required]
    });

    this.checkoutFormAlt = this.fb.group({
      country: ['', Validators.required],
      firstName: ['', Validators.required],
      lastName: ['', Validators.required],
      company: [],
      address1: ['', Validators.required],
      address2: [],
      city: ['', Validators.required],
      zip: ['', Validators.required],
      phone: ['', Validators.required],
      email: ['', Validators.required]
    });
  }


  placeOrder() {
    const billingAddress = this.checkoutForm.value;
    let shippingAddress;

    if (this.hasAltAddress) {
      shippingAddress = this.checkoutFormAlt.value;
    }

    console.log(billingAddress, shippingAddress, this.paymentMethod);
  }

}
