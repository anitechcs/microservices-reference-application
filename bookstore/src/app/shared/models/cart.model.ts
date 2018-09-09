import { Product } from './product.model';

export interface CartItem {
  product: Product;
  data: {
    quantity: number,
    options?: any
  };
}
