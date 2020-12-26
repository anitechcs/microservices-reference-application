import { Component, OnInit } from '@angular/core';
import { StoreService } from '../../shared/services/store.service';
import { AppAnimations } from '../../shared/animations/animations';

@Component({
  selector: 'app-checkout',
  templateUrl: './orders.component.html',
  styleUrls: ['./orders.component.scss'],
  animations: AppAnimations
})
export class OrdersComponent implements OnInit {


  constructor(
    private storeService: StoreService
  ) { }

  ngOnInit() {

  }


}
