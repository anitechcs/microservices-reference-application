package com.anitechcs.bookservice.model;

import java.util.Objects;
import com.anitechcs.bookservice.model.BookPrice;
import com.anitechcs.bookservice.model.BookPromotions;
import com.anitechcs.bookservice.model.BookRatings;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Book
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-12-21T12:56:51.345Z[GMT]")
public class Book   {
  @JsonProperty("bookId")
  private Long bookId;

  @JsonProperty("title")
  private String title;

  @JsonProperty("description")
  private String description;

  @JsonProperty("authors")
  @Valid
  private List<String> authors = null;

  @JsonProperty("isbn")
  private String isbn;

  @JsonProperty("language")
  private String language;

  @JsonProperty("totalPages")
  private Integer totalPages;

  @JsonProperty("publicationDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate publicationDate;

  @JsonProperty("publisher")
  private String publisher;

  @JsonProperty("genres")
  @Valid
  private List<String> genres = null;

  @JsonProperty("tags")
  @Valid
  private List<String> tags = null;

  @JsonProperty("price")
  private BookPrice price;

  @JsonProperty("ratings")
  private BookRatings ratings;

  @JsonProperty("coverPhoto")
  private String coverPhoto;

  @JsonProperty("promotions")
  private BookPromotions promotions;

  public Book bookId(Long bookId) {
    this.bookId = bookId;
    return this;
  }

  /**
   * Unique book Id in the system
   * @return bookId
  */
  @ApiModelProperty(value = "Unique book Id in the system")


  public Long getBookId() {
    return bookId;
  }

  public void setBookId(Long bookId) {
    this.bookId = bookId;
  }

  public Book title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the book
   * @return title
  */
  @ApiModelProperty(value = "Title of the book")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Book description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description about book
   * @return description
  */
  @ApiModelProperty(value = "Description about book")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Book authors(List<String> authors) {
    this.authors = authors;
    return this;
  }

  public Book addAuthorsItem(String authorsItem) {
    if (this.authors == null) {
      this.authors = new ArrayList<>();
    }
    this.authors.add(authorsItem);
    return this;
  }

  /**
   * Book authors
   * @return authors
  */
  @ApiModelProperty(value = "Book authors")


  public List<String> getAuthors() {
    return authors;
  }

  public void setAuthors(List<String> authors) {
    this.authors = authors;
  }

  public Book isbn(String isbn) {
    this.isbn = isbn;
    return this;
  }

  /**
   * ISBN of the book
   * @return isbn
  */
  @ApiModelProperty(value = "ISBN of the book")


  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public Book language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Language in which book is written
   * @return language
  */
  @ApiModelProperty(value = "Language in which book is written")


  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public Book totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Total number of pages
   * @return totalPages
  */
  @ApiModelProperty(value = "Total number of pages")


  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public Book publicationDate(LocalDate publicationDate) {
    this.publicationDate = publicationDate;
    return this;
  }

  /**
   * Book publication date
   * @return publicationDate
  */
  @ApiModelProperty(value = "Book publication date")

  @Valid

  public LocalDate getPublicationDate() {
    return publicationDate;
  }

  public void setPublicationDate(LocalDate publicationDate) {
    this.publicationDate = publicationDate;
  }

  public Book publisher(String publisher) {
    this.publisher = publisher;
    return this;
  }

  /**
   * Publisher of the book
   * @return publisher
  */
  @ApiModelProperty(value = "Publisher of the book")


  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public Book genres(List<String> genres) {
    this.genres = genres;
    return this;
  }

  public Book addGenresItem(String genresItem) {
    if (this.genres == null) {
      this.genres = new ArrayList<>();
    }
    this.genres.add(genresItem);
    return this;
  }

  /**
   * Genres of the book
   * @return genres
  */
  @ApiModelProperty(value = "Genres of the book")


  public List<String> getGenres() {
    return genres;
  }

  public void setGenres(List<String> genres) {
    this.genres = genres;
  }

  public Book tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Book addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags
   * @return tags
  */
  @ApiModelProperty(value = "Tags")


  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public Book price(BookPrice price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @ApiModelProperty(value = "")

  @Valid

  public BookPrice getPrice() {
    return price;
  }

  public void setPrice(BookPrice price) {
    this.price = price;
  }

  public Book ratings(BookRatings ratings) {
    this.ratings = ratings;
    return this;
  }

  /**
   * Get ratings
   * @return ratings
  */
  @ApiModelProperty(value = "")

  @Valid

  public BookRatings getRatings() {
    return ratings;
  }

  public void setRatings(BookRatings ratings) {
    this.ratings = ratings;
  }

  public Book coverPhoto(String coverPhoto) {
    this.coverPhoto = coverPhoto;
    return this;
  }

  /**
   * Book cover image
   * @return coverPhoto
  */
  @ApiModelProperty(value = "Book cover image")


  public String getCoverPhoto() {
    return coverPhoto;
  }

  public void setCoverPhoto(String coverPhoto) {
    this.coverPhoto = coverPhoto;
  }

  public Book promotions(BookPromotions promotions) {
    this.promotions = promotions;
    return this;
  }

  /**
   * Get promotions
   * @return promotions
  */
  @ApiModelProperty(value = "")

  @Valid

  public BookPromotions getPromotions() {
    return promotions;
  }

  public void setPromotions(BookPromotions promotions) {
    this.promotions = promotions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Book book = (Book) o;
    return Objects.equals(this.bookId, book.bookId) &&
        Objects.equals(this.title, book.title) &&
        Objects.equals(this.description, book.description) &&
        Objects.equals(this.authors, book.authors) &&
        Objects.equals(this.isbn, book.isbn) &&
        Objects.equals(this.language, book.language) &&
        Objects.equals(this.totalPages, book.totalPages) &&
        Objects.equals(this.publicationDate, book.publicationDate) &&
        Objects.equals(this.publisher, book.publisher) &&
        Objects.equals(this.genres, book.genres) &&
        Objects.equals(this.tags, book.tags) &&
        Objects.equals(this.price, book.price) &&
        Objects.equals(this.ratings, book.ratings) &&
        Objects.equals(this.coverPhoto, book.coverPhoto) &&
        Objects.equals(this.promotions, book.promotions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookId, title, description, authors, isbn, language, totalPages, publicationDate, publisher, genres, tags, price, ratings, coverPhoto, promotions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Book {\n");
    
    sb.append("    bookId: ").append(toIndentedString(bookId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    authors: ").append(toIndentedString(authors)).append("\n");
    sb.append("    isbn: ").append(toIndentedString(isbn)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    publicationDate: ").append(toIndentedString(publicationDate)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    genres: ").append(toIndentedString(genres)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    ratings: ").append(toIndentedString(ratings)).append("\n");
    sb.append("    coverPhoto: ").append(toIndentedString(coverPhoto)).append("\n");
    sb.append("    promotions: ").append(toIndentedString(promotions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

