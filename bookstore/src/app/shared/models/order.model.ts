export interface Order {
  orderId: number;
  bookId: number;
  quantity: number;
  shipDate: string;
  address: string;
  amount: number;
}