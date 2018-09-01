import { Component, OnInit, AfterViewInit, Renderer2 } from '@angular/core';
import { Title } from '@angular/platform-browser';
import { ThemeService } from './shared/services/theme.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit, AfterViewInit {
  appTitle = 'Egret';
  pageTitle = '';

  constructor(
    public title: Title,
    private themeService: ThemeService,
    private renderer: Renderer2
  ) { }

  ngOnInit() {
    // some code
  }

  ngAfterViewInit() {
    this.themeService.applyMatTheme(this.renderer);
  }

}
