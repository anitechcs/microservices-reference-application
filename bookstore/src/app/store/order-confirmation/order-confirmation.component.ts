import { Component, OnInit } from '@angular/core';
import { StoreService } from '../../shared/services/store.service';
import { AppAnimations } from '../../shared/animations/animations';

@Component({
  selector: 'app-checkout',
  templateUrl: './order-confirmation.component.html',
  styleUrls: ['./order-confirmation.component.scss'],
  animations: AppAnimations
})
export class OrderConfirmationComponent implements OnInit {

  constructor(
    private storeService: StoreService
  ) { }

  ngOnInit() {

  }

}
