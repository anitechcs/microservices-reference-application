import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { FlexLayoutModule } from '@angular/flex-layout';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatListModule } from '@angular/material/list';
import { MatTooltipModule } from '@angular/material/tooltip';
import { MatOptionModule } from '@angular/material/core';
import { MatSelectModule } from '@angular/material/select';
import { MatMenuModule } from '@angular/material/menu';
import { MatSnackBarModule } from '@angular/material/snack-bar';
import { MatGridListModule } from '@angular/material/grid-list';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatIconModule } from '@angular/material/icon';
import { MatButtonModule } from '@angular/material/button';
import { MatRadioModule } from '@angular/material/radio';
import { MatCheckboxModule } from '@angular/material/checkbox';
import { MatCardModule } from '@angular/material/card';
import { MatProgressSpinnerModule } from '@angular/material/progress-spinner';
import { MatRippleModule } from '@angular/material/core';
import { MatDialogModule } from '@angular/material/dialog';
import { StoreLayoutComponent } from './components/store-layout/store-layout.component';
import { LoaderComponent } from './components/loader/loader.component';
import { HeaderTopComponent } from './components/header-top/header-top.component';
import { StoreSideNavFilterDirective } from './directives/store-side-nav-filter.directive';
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
    StoreLayoutComponent,
    LoaderComponent,
    StoreSideNavFilterDirective
  ],
  declarations: [
    HeaderTopComponent,
    StoreLayoutComponent,
    LoaderComponent,
    StoreSideNavFilterDirective
  ],
  providers: [
    LoaderService,
    AuthService
  ],
  entryComponents: [ LoaderComponent ],
})
export class SharedModule { }
