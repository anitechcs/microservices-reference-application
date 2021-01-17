export interface Book {
  bookId: number;
  title: string;
  description?: string;
  authors: string[];
  isbn: string;
  language: string;
  totalPages: number;
  publicationDate: string;
  publisher: string;
  genres: string[];
  tags?: string[];
  price: {
    currency: string,
    amount: number,
    mrp: number
  };
  ratings?: {
    rating: number,
    ratingCount: number
  };
  coverPhoto: string;
  promotions?: { 
    text: string, 
    color: string 
  };
}
