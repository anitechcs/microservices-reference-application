import { Routes } from '@angular/router';
import { StoreLayoutComponent } from './shared/components/store-layout/store-layout.component';
import { BooksComponent } from './store/books/books.component';
import { BookDetailsComponent } from './store/book-details/book-details.component';
import { CartComponent } from './store/cart/cart.component';
import { CheckoutComponent } from './store/checkout/checkout.component';
import { OrderConfirmationComponent } from './store/order-confirmation/order-confirmation.component';
import { OrdersComponent } from './store/orders/orders.component';
import { OrderDetailsComponent } from './store/order-details/order-details.component';

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
        path: 'books/:bookId',
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
      },
      {
        path: 'order/confirmation',
        component: OrderConfirmationComponent,
        data: { title: 'Order Confirmation', breadcrumb: 'Order Confirmation' }
      },
      {
        path: 'orders',
        component: OrdersComponent,
        data: { title: 'Order History', breadcrumb: 'Orders' }
      },
      {
        path: 'orders/:orderId',
        component: OrderDetailsComponent,
        data: { title: 'Order Details', breadcrumb: 'Order Details' }
      }
    ]
  },
  {
    path: '**',
    redirectTo: '404'
  }
];
