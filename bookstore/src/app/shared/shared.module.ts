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

// ONLY REQUIRED FOR **TOP** NAVIGATION LAYOUT
import { HeaderTopComponent } from './components/header-top/header-top.component';

// ALL TIME REQUIRED
import { ShopLayoutComponent } from './components/layouts/shop-layout/shop-layout.component';
import { NotificationsComponent } from './components/notifications/notifications.component';
import { AppLoaderComponent } from './services/app-loader/app-loader.component';

// DIRECTIVES
import { ShopSideNavFilterDirective } from './directives/shop-side-nav-filter.directive';

// SERVICES
import { ThemeService } from './services/theme.service';
import { LayoutService } from './services/layout.service';
import { AuthGuard } from './services/auth.guard';
import { AppLoaderService } from './services/app-loader/app-loader.service';


const classesToInclude = [
  HeaderTopComponent,
  NotificationsComponent,
  ShopLayoutComponent,
  AppLoaderComponent,
  ShopSideNavFilterDirective
];

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
  entryComponents: [AppLoaderComponent],
  providers: [
    ThemeService,
    LayoutService,
    AuthGuard,
    AppLoaderService
  ],
  declarations: classesToInclude,
  exports: classesToInclude
})
export class SharedModule { }
