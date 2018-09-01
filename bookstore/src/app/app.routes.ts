import { Routes } from '@angular/router';
import { ShopLayoutComponent } from './shared/components/layouts/shop-layout/shop-layout.component';
import { AuthGuard } from './shared/services/auth.guard';
import { ProductsComponent } from './shop/products/products.component';
import { ProductDetailsComponent } from './shop/product-details/product-details.component';
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
    canActivate: [ AuthGuard ],
    children: [
      {
        path: '',
        component: ProductsComponent
      }, {
        path: 'products/:id',
        component: ProductDetailsComponent,
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
    redirectTo: 'sessions/404'
  }
];
