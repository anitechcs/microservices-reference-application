import { Routes } from '@angular/router';
import { StoreLayoutComponent } from './shared/components/store-layout/store-layout.component';
import { BooksComponent } from './store/books/books.component';
import { BookDetailsComponent } from './store/book-details/book-details.component';
import { CartComponent } from './store/cart/cart.component';
import { CheckoutComponent } from './store/checkout/checkout.component';

export const rootRouterConfig: Routes = [
  {
    path: '',
    redirectTo: 'store',
    pathMatch: 'full'
  },
  {
    path: 'store',
    component: StoreLayoutComponent,
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
        data: { title: 'Cart', breadcrumb: 'Cart' }
      }, {
        path: 'checkout',
        component: CheckoutComponent,
        data: { title: 'Checkout', breadcrumb: 'Checkout' }
      }
    ]
  },
  {
    path: '**',
    redirectTo: '404'
  }
];
