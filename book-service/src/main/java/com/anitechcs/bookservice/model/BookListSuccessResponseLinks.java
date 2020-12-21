package com.anitechcs.bookservice.model;

import java.util.Objects;
import com.anitechcs.bookservice.model.BookListSuccessResponseLinksSelf;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BookListSuccessResponseLinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class BookListSuccessResponseLinks   {
  @JsonProperty("self")
  private BookListSuccessResponseLinksSelf self;

  @JsonProperty("first")
  private BookListSuccessResponseLinksSelf first;

  @JsonProperty("prev")
  private BookListSuccessResponseLinksSelf prev;

  @JsonProperty("next")
  private BookListSuccessResponseLinksSelf next;

  @JsonProperty("last")
  private BookListSuccessResponseLinksSelf last;

  public BookListSuccessResponseLinks self(BookListSuccessResponseLinksSelf self) {
    this.self = self;
    return this;
  }

  /**
   * Get self
   * @return self
  */
  @ApiModelProperty(value = "")

  @Valid

  public BookListSuccessResponseLinksSelf getSelf() {
    return self;
  }

  public void setSelf(BookListSuccessResponseLinksSelf self) {
    this.self = self;
  }

  public BookListSuccessResponseLinks first(BookListSuccessResponseLinksSelf first) {
    this.first = first;
    return this;
  }

  /**
   * Get first
   * @return first
  */
  @ApiModelProperty(value = "")

  @Valid

  public BookListSuccessResponseLinksSelf getFirst() {
    return first;
  }

  public void setFirst(BookListSuccessResponseLinksSelf first) {
    this.first = first;
  }

  public BookListSuccessResponseLinks prev(BookListSuccessResponseLinksSelf prev) {
    this.prev = prev;
    return this;
  }

  /**
   * Get prev
   * @return prev
  */
  @ApiModelProperty(value = "")

  @Valid

  public BookListSuccessResponseLinksSelf getPrev() {
    return prev;
  }

  public void setPrev(BookListSuccessResponseLinksSelf prev) {
    this.prev = prev;
  }

  public BookListSuccessResponseLinks next(BookListSuccessResponseLinksSelf next) {
    this.next = next;
    return this;
  }

  /**
   * Get next
   * @return next
  */
  @ApiModelProperty(value = "")

  @Valid

  public BookListSuccessResponseLinksSelf getNext() {
    return next;
  }

  public void setNext(BookListSuccessResponseLinksSelf next) {
    this.next = next;
  }

  public BookListSuccessResponseLinks last(BookListSuccessResponseLinksSelf last) {
    this.last = last;
    return this;
  }

  /**
   * Get last
   * @return last
  */
  @ApiModelProperty(value = "")

  @Valid

  public BookListSuccessResponseLinksSelf getLast() {
    return last;
  }

  public void setLast(BookListSuccessResponseLinksSelf last) {
    this.last = last;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookListSuccessResponseLinks bookListSuccessResponseLinks = (BookListSuccessResponseLinks) o;
    return Objects.equals(this.self, bookListSuccessResponseLinks.self) &&
        Objects.equals(this.first, bookListSuccessResponseLinks.first) &&
        Objects.equals(this.prev, bookListSuccessResponseLinks.prev) &&
        Objects.equals(this.next, bookListSuccessResponseLinks.next) &&
        Objects.equals(this.last, bookListSuccessResponseLinks.last);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, first, prev, next, last);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookListSuccessResponseLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
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

