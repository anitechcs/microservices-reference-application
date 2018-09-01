import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { FlexLayoutModule } from '@angular/flex-layout';
import {
  MatSidenavModule,
  MatListModule,
  MatTooltipModule,
  MatOptionModule,
  MatSelectModule,
  MatMenuModule,
  MatSnackBarModule,
  MatGridListModule,
  MatToolbarModule,
  MatIconModule,
  MatButtonModule,
  MatRadioModule,
  MatCheckboxModule,
  MatCardModule,
  MatProgressSpinnerModule,
  MatRippleModule,
  MatDialogModule
} from '@angular/material';

// COMPONENTS
import { ShopLayoutComponent } from './components/layouts/shop-layout/shop-layout.component';
import { NotificationsComponent } from './components/notifications/notifications.component';
import { LoaderComponent } from './components/loader/loader.component';
import { HeaderTopComponent } from './components/header-top/header-top.component';

// DIRECTIVES
import { ShopSideNavFilterDirective } from './directives/shop-side-nav-filter.directive';

// SERVICES
import { LoaderService } from './services/loader.service';
import { AuthService } from './services/auth.service';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    RouterModule,
    FlexLayoutModule,
    MatSidenavModule,
    MatListModule,
    MatTooltipModule,
    MatOptionModule,
    MatSelectModule,
    MatMenuModule,
    MatSnackBarModule,
    MatGridListModule,
    MatToolbarModule,
    MatIconModule,
    MatButtonModule,
    MatRadioModule,
    MatCheckboxModule,
    MatCardModule,
    MatProgressSpinnerModule,
    MatRippleModule,
    MatDialogModule
  ],
  exports: [
    HeaderTopComponent,
    NotificationsComponent,
    ShopLayoutComponent,
    LoaderComponent,
    ShopSideNavFilterDirective
  ],
  declarations: [
    HeaderTopComponent,
    NotificationsComponent,
    ShopLayoutComponent,
    LoaderComponent,
    ShopSideNavFilterDirective
  ],
  providers: [
    LoaderService,
    AuthService
  ],
  entryComponents: [LoaderComponent],
})
export class SharedModule { }
