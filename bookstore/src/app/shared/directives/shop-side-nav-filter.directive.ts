import { Directive, Host, Self, Optional, OnDestroy, OnInit } from '@angular/core';
import { MediaChange, MediaObserver } from '@angular/flex-layout';
import { Subscription } from 'rxjs';
import { MatSidenav } from '@angular/material/sidenav';


@Directive({
  selector: '[ShopSideNavFilter]'
})
export class ShopSideNavFilterDirective implements OnInit, OnDestroy {
  isMobile: boolean = false;
  screenSizeWatcher: Subscription;
  
  constructor(
    private media: MediaObserver,
    @Host() @Self() @Optional() public sideNav: MatSidenav
  ) {}

  ngOnInit() {
    this.initSideNav();
  }

  ngOnDestroy() {
    if (this.screenSizeWatcher) {
      this.screenSizeWatcher.unsubscribe();
    }
  }

  updateSidenav() {
    const self = this;
    setTimeout(() => {
      self.sideNav.opened = !self.isMobile;
      self.sideNav.mode = self.isMobile ? 'over' : 'side';
    });
  }

  initSideNav() {
    this.isMobile = this.media.isActive('xs') || this.media.isActive('sm');
    this.updateSidenav();
    this.screenSizeWatcher = this.media.asObservable().subscribe((change: MediaChange[]) => {
      this.isMobile = (change[0].mqAlias === 'xs') || (change[0].mqAlias === 'sm');
      this.updateSidenav();
    });
  }

}
