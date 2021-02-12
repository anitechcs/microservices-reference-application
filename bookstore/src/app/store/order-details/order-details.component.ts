import { Component, OnInit } from '@angular/core';
import { Observable, Subscription } from 'rxjs';
import { map } from 'rxjs/operators';
import { ActivatedRoute } from '@angular/router';
import { LoaderService } from '../../shared/services/loader.service';
import { StoreService } from '../../shared/services/store.service';
import { AppAnimations } from '../../shared/animations/animations';
import { Order } from 'src/app/shared/models/order.model';

@Component({
  selector: 'app-order-details',
  templateUrl: './order-details.component.html',
  styleUrls: ['./order-details.component.scss'],
  animations: AppAnimations
})
export class OrderDetailsComponent implements OnInit {

  public order$!: Observable<Order>;
  public selectedOrder!: Order;
  public selectedOrderSubscription!: Subscription;
  public orderID: number = 0;
  public bookName: string = '';

  constructor(
    private storeService: StoreService,
    private route: ActivatedRoute,
    private loader: LoaderService
  ) {
    this.orderID = this.route.snapshot.params['orderId'];
   }

  ngOnInit() {
    setTimeout(() => {
      //this.loader.open();
    });
    this.order$ = this.storeService
      .getOrderDetails(this.orderID)
      .pipe(
        map(order => {
          //this.loader.close();
          this.getBookName(order.bookId);
          return order;
        })
      );
    
    this.selectedOrderSubscription = this.order$.subscribe(order => this.selectedOrder = order);
  }

  getBookName(bookId: number) {
    this.storeService
      .getBookDetails(bookId)
      .subscribe(book => {
        this.bookName = book.title;
      });
  }

  ngOnDestroy() {
    this.selectedOrderSubscription.unsubscribe()
  }

}
