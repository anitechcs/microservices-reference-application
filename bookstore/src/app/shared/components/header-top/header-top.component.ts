import { Component, OnInit, Input, OnDestroy, Renderer2, Inject } from '@angular/core';
import { NavigationService } from '../../services/navigation.service';
import { Subscription } from 'rxjs';
import { ThemeService } from '../../../shared/services/theme.service';
import { TranslateService } from '@ngx-translate/core';
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
  currentLang = 'en';
  availableLangs = [{
    name: 'English',
    code: 'en',
  }, {
    name: 'Spanish',
    code: 'es',
  }]
  @Input() notificPanel;
  constructor(
    private layout: LayoutService,
    private navService: NavigationService,
    public themeService: ThemeService,
    public translate: TranslateService,
    private renderer: Renderer2,
    @Inject(DOCUMENT) private document: any
  ) { }

  ngOnInit() {
    this.layoutConf = this.layout.layoutConf;
    this.egretThemes = this.themeService.egretThemes;
    this.menuItemSub = this.navService.menuItems$
    .subscribe(res => {
      res = res.filter(item => item.type !== 'icon' && item.type !== 'separator');
      let limit = 4
      let mainItems:any[] = res.slice(0, limit)
      if(res.length <= limit) {
        return this.menuItems = mainItems
      }
      let subItems:any[] = res.slice(limit, res.length - 1)
      mainItems.push({
        name: 'More',
        type: 'dropDown',
        tooltip: 'More',
        icon: 'more_horiz',
        sub: subItems
      })
      this.menuItems = mainItems
    })
  }
  ngOnDestroy() {
    this.menuItemSub.unsubscribe()
  }
  setLang() {
    this.translate.use(this.currentLang)
  }
  changeTheme(theme) {
    this.themeService.changeTheme(this.renderer, theme);
  }
  toggleNotific() {
    this.notificPanel.toggle();
  }
  toggleSidenav() {
    if(this.layoutConf.sidebarStyle === 'closed') {
      return this.layout.publishLayoutChange({
        sidebarStyle: 'full'
      })
    }
    this.layout.publishLayoutChange({
      sidebarStyle: 'closed'
    })
  }

  doLogout() {
    this.document.location.href = 'http://localhost:4200';
  }
}
