import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { FlexLayoutModule } from '@angular/flex-layout';
import { TranslateModule } from '@ngx-translate/core';
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

// ONLY REQUIRED FOR **SIDE** NAVIGATION LAYOUT
import { HeaderSideComponent } from './components/header-side/header-side.component';

// ONLY REQUIRED FOR **TOP** NAVIGATION LAYOUT
import { HeaderTopComponent } from './components/header-top/header-top.component';

// ALL TIME REQUIRED
import { AdminLayoutComponent } from './components/layouts/admin-layout/admin-layout.component';
import { NotificationsComponent } from './components/notifications/notifications.component';
import { SidenavComponent } from './components/sidenav/sidenav.component';
import { AppComfirmComponent } from './services/app-confirm/app-confirm.component';
import { AppLoaderComponent } from './services/app-loader/app-loader.component';

// DIRECTIVES
import { FontSizeDirective } from './directives/font-size.directive';
import { ScrollToDirective } from './directives/scroll-to.directive';
import { AppDropdownDirective } from './directives/dropdown.directive';
import { DropdownAnchorDirective } from './directives/dropdown-anchor.directive';
import { DropdownLinkDirective } from './directives/dropdown-link.directive';
import { EgretSideNavToggleDirective } from './directives/egret-side-nav-toggle.directive';

// PIPES
import { RelativeTimePipe } from './pipes/relative-time.pipe';
// import { ExcerptPipe } from "./pipes/excerpt.pipe";

// SERVICES
import { ThemeService } from './services/theme.service';
import { LayoutService } from './services/layout.service';
// import { NavigationService } from "./services/navigation.service";
import { RoutePartsService } from './services/route-parts.service';
import { AuthGuard } from './services/auth.guard';
import { AppConfirmService } from './services/app-confirm/app-confirm.service';
import { AppLoaderService } from './services/app-loader/app-loader.service';
import { NavigationService } from './services/navigation.service';


const classesToInclude = [
  HeaderTopComponent,
  SidenavComponent,
  NotificationsComponent,
  HeaderSideComponent,
  AdminLayoutComponent,
  AppComfirmComponent,
  AppLoaderComponent,
  FontSizeDirective,
  ScrollToDirective,
  AppDropdownDirective,
  DropdownAnchorDirective,
  DropdownLinkDirective,
  EgretSideNavToggleDirective,
  RelativeTimePipe
];

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    RouterModule,
    FlexLayoutModule,
    TranslateModule,
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
  entryComponents: [AppComfirmComponent, AppLoaderComponent],
  providers: [
    ThemeService,
    LayoutService,
    NavigationService,
    RoutePartsService,
    AuthGuard,
    AppConfirmService,
    AppLoaderService
  ],
  declarations: classesToInclude,
  exports: classesToInclude
})
export class SharedModule { }
