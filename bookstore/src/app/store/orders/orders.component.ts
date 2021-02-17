import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { LoaderService } from '../../shared/services/loader.service';
import { StoreService } from '../../shared/services/store.service';
import { AppAnimations } from '../../shared/animations/animations';
import { Order } from 'src/app/shared/models/order.model';
import { Book } from 'src/app/shared/models/book.model';

@Component({
  selector: 'app-orders',
  templateUrl: './orders.component.html',
  styleUrls: ['./orders.component.scss'],
  animations: AppAnimations
})
export class OrdersComponent implements OnInit {

  public orders$!: Observable<Order[]>;

  constructor(
    private storeService: StoreService,
    private loader: LoaderService
  ) { }

  ngOnInit() {
    setTimeout(() => {
      this.loader.open();
    });
    this.orders$ = this.storeService
      .getOrders()
      .pipe(
        map(orders => {
          this.loader.close();
          return orders;
        })
      );
  }

  getBookName(bookId: number): Observable<string> {
    return this.storeService
      .getBookDetails(bookId)
      .pipe(
        map((book: Book) => {
          return book.title;
        })
      );
  }

}
