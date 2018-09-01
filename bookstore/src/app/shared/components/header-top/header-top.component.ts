import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-header-top',
  templateUrl: './header-top.component.html',
  styleUrls: ['./header-top.component.scss']
})
export class HeaderTopComponent {

  @Input() notificPanel;
  constructor() { }

  toggleNotific() {
    this.notificPanel.toggle();
  }

  doLogout() {
    // TODO: Logout
  }
}
