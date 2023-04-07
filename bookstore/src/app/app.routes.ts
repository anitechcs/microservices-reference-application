import { Routes } from '@angular/router';
import { StoreLayoutComponent } from './shared/components/store-layout/store-layout.component';
import { BooksComponent } from './store/books/books.component';
import { BookDetailsComponent } from './store/book-details/book-details.component';
import { CartComponent } from './store/cart/cart.component';
import { CheckoutComponent } from './store/checkout/checkout.component';
import { OrderConfirmationComponent } from './store/order-confirmation/order-confirmation.component';
import { OrdersComponent } from './store/orders/orders.component';
import { OrderDetailsComponent } from './store/order-details/order-details.component';
import { PageNotFoundComponent } from './shared/components/page-not-found/page-not-found.component';

export const rootRouterConfig: Routes = [
  {
    path: '',
    component: StoreLayoutComponent,
    children: [
      {
        path: '',
        component: BooksComponent
      }, {
        path: 'books/:bookId',
        component: BookDetailsComponent,
      }, {
        path: 'cart',
        component: CartComponent,
      }, {
        path: 'checkout',
        component: CheckoutComponent,
      },
      {
        path: 'order/confirmation',
        component: OrderConfirmationComponent,
      },
      {
        path: 'orders',
        component: OrdersComponent,
      },
      {
        path: 'orders/:orderId',
        component: OrderDetailsComponent,
      }
    ]
  },
  {
    path: '**',
    component: PageNotFoundComponent
  }
];
