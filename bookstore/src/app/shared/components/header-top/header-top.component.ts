import { Component, OnInit, Input, OnDestroy, Renderer2, Inject } from '@angular/core';
import { Subscription } from 'rxjs';
import { ThemeService } from '../../../shared/services/theme.service';
import { LayoutService } from '../../services/layout.service';
import { DOCUMENT } from '@angular/common';

@Component({
  selector: 'app-header-top',
  templateUrl: './header-top.component.html'
})
export class HeaderTopComponent implements OnInit, OnDestroy {
  layoutConf: any;
  menuItems: any;
  menuItemSub: Subscription;
  egretThemes: any[] = [];
  @Input() notificPanel;
  constructor(
    private layout: LayoutService,
    public themeService: ThemeService,
    private renderer: Renderer2,
    @Inject(DOCUMENT) private document: any
  ) { }

  ngOnInit() {
    this.layoutConf = this.layout.layoutConf;
    this.egretThemes = this.themeService.egretThemes;
  }

  ngOnDestroy() {
    this.menuItemSub.unsubscribe();
  }

  changeTheme(theme) {
    this.themeService.changeTheme(this.renderer, theme);
  }

  toggleNotific() {
    this.notificPanel.toggle();
  }

  doLogout() {
    this.document.location.href = 'http://localhost:4200';
  }
}
