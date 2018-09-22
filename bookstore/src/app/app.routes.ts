import { Routes } from '@angular/router';
import { ShopLayoutComponent } from './shared/components/shop-layout/shop-layout.component';
import { BooksComponent } from './shop/books/books.component';
import { BookDetailsComponent } from './shop/book-details/book-details.component';
import { CartComponent } from './shop/cart/cart.component';
import { CheckoutComponent } from './shop/checkout/checkout.component';

export const rootRouterConfig: Routes = [
  {
    path: '',
    redirectTo: 'shop',
    pathMatch: 'full'
  },
  {
    path: 'shop',
    component: ShopLayoutComponent,
    children: [
      {
        path: '',
        component: BooksComponent
      }, {
        path: 'books/:id',
        component: BookDetailsComponent,
        data: { title: 'Detail', breadcrumb: 'Detail' }
      }, {
        path: 'cart',
        component: CartComponent,
        data: { title: 'Cart', breadcrumb: 'CART' }
      }, {
        path: 'checkout',
        component: CheckoutComponent,
        data: { title: 'Checkout', breadcrumb: 'CHECKOUT' }
      }
    ]
  },
  {
    path: '**',
    redirectTo: '404'
  }
];
