import { Component, OnInit, ViewChild } from '@angular/core';
import { MatSidenav } from '@angular/material/sidenav';
import { MatSnackBar } from '@angular/material/snack-bar';
import { StoreService } from '../../shared/services/store.service';
import { Book } from '../../shared/models/book.model';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { AppAnimations } from '../../shared/animations/animations';
import { LoaderService } from '../../shared/services/loader.service';
import { CartItem } from '../../shared/models/cart.model';

@Component({
  selector: 'app-books',
  templateUrl: './books.component.html',
  styleUrls: ['./books.component.scss'],
  animations: [ AppAnimations ]
})
export class BooksComponent implements OnInit {
  public isSideNavOpen: boolean = false;
  public viewMode = 'grid-view';
  public currentPage: any;
  @ViewChild('sideNav')
  sideNav!: MatSidenav;

  public books$: Observable<Book[]>;
  public genres$: Observable<any>;
  public activeGenre = 'all';
  public filterForm: FormGroup;
  public cart: CartItem[];
  public cartData: any;

  constructor(
    private storeService: StoreService,
    private fb: FormBuilder,
    private snackBar: MatSnackBar,
    private loader: LoaderService
  ) { }

  ngOnInit() {
    this.genres$ = this.storeService.getGenres();
    this.buildFilterForm(this.storeService.initialFilters);

    setTimeout(() => {
      this.loader.open();
    });
    this.books$ = this.storeService
      .getFilteredBook(this.filterForm)
      .pipe(
        map(books => {
          this.loader.close();
          return books;
        })
      );
    this.getCart();
    this.cartData = this.storeService.cartData;
  }

  getCart() {
    this.storeService
    .getCart()
    .subscribe(cart => {
      this.cart = cart;
    });
  }

  addToCart(book: Book) {
    const cartItem: CartItem = {
      book: book,
      data: {
        quantity: 1
      }
    };
    this.storeService
    .addToCart(cartItem)
    .subscribe(cart => {
      this.cart = cart;
      this.snackBar.open('Book added to cart', 'OK', { duration: 4000 });
    });
  }

  buildFilterForm(filterData: any = {}) {
    this.filterForm = this.fb.group({
      search: [''],
      genre: ['all'],
      minPrice: [filterData.minPrice],
      maxPrice: [filterData.maxPrice],
      minRating: [filterData.minRating],
      maxRating: [filterData.maxRating]
    });
  }
  
  setActiveGenre(genre: string) {
    this.activeGenre = genre;
    this.filterForm.controls['genre'].setValue(genre);
  }

  toggleSideNav() {
    this.sideNav.opened = !this.sideNav.opened;
  }
}
