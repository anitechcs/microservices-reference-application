import { Component, OnInit, Input } from '@angular/core';
import { Router, NavigationEnd } from '@angular/router';
import { NotificationsDB } from '../../../shared/mock-data/notifications';

@Component({
  selector: 'app-notifications',
  templateUrl: './notifications.component.html',
  styleUrls: ['./notifications.component.scss']
})
export class NotificationsComponent implements OnInit {
  @Input() notificPanel;
  notifications = [];

  constructor(private router: Router) {
    const notificationDb = new NotificationsDB();
    this.notifications = notificationDb.notifications;
  }

  ngOnInit() {
    this.router.events.subscribe((routeChange) => {
        if (routeChange instanceof NavigationEnd) {
          this.notificPanel.close();
        }
    });
  }

  clearAll(e) {
    e.preventDefault();
    this.notifications = [];
  }

}
