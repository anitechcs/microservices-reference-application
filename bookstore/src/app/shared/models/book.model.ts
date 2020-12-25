export class Book {
  public bookId: number;
  public title: string;
  public description?: string;
  public authors: string[];
  public isbn: string;
  public language: string;
  public totalPages: number;
  public publicationDate: string;
  public publisher: string;
  public genres: string[];
  public tags?: string[];
  public price: {
    currency: string,
    amount: number
  };
  public ratings?: {
    rating: number,
    ratingCount: number
  };
  public coverPhoto: string;
  public promotions?: { 
    text: string, 
    color: string 
  };
}
