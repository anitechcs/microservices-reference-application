import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { FlexLayoutModule } from '@angular/flex-layout';
import {
  MatIconModule,
  MatButtonModule,
  MatCardModule,
  MatMenuModule,
  MatSlideToggleModule,
  MatChipsModule,
  MatCheckboxModule,
  MatRadioModule,
  MatTabsModule,
  MatInputModule,
  MatSelectModule,
  MatSliderModule,
  MatExpansionModule,
  MatSnackBarModule,
  MatListModule,
  MatSidenavModule,
  MatRippleModule,
  MatFormFieldModule
 } from '@angular/material';
import { StarRatingModule } from 'angular-star-rating';
import { NgxPaginationModule } from 'ngx-pagination';
import { SharedModule } from '../shared/shared.module';

import { BooksComponent } from './books/books.component';
import { ShopService } from '../shared/services/shop.service';
import { BookDetailsComponent } from './book-details/book-details.component';
import { CartComponent } from './cart/cart.component';
import { CheckoutComponent } from './checkout/checkout.component';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    FlexLayoutModule,
    MatIconModule,
    MatButtonModule,
    MatCardModule,
    MatMenuModule,
    MatSlideToggleModule,
    MatChipsModule,
    MatCheckboxModule,
    MatFormFieldModule,
    MatRadioModule,
    MatRippleModule,
    MatTabsModule,
    MatInputModule,
    MatSelectModule,
    MatSliderModule,
    MatExpansionModule,
    MatSnackBarModule,
    MatListModule,
    MatSidenavModule,
    StarRatingModule.forChild(),
    NgxPaginationModule,
    RouterModule,
    SharedModule
  ],
  declarations: [
    BooksComponent,
    BookDetailsComponent,
    CartComponent,
    CheckoutComponent
  ],
  providers: [ShopService]
})
export class ShopModule { }
