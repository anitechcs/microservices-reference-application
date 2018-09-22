import { Book } from './book.model';

export interface CartItem {
  book: Book;
  data: {
    quantity: number,
    options?: any
  };
}
