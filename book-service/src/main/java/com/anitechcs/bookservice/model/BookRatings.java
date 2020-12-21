package com.anitechcs.bookservice.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Book rating details
 */
@ApiModel(description = "Book rating details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-12-21T12:38:06.024Z[GMT]")
public class BookRatings   {
  @JsonProperty("rating")
  private Float rating;

  @JsonProperty("ratingCount")
  private Integer ratingCount;

  public BookRatings rating(Float rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Book rating
   * @return rating
  */
  @ApiModelProperty(value = "Book rating")


  public Float getRating() {
    return rating;
  }

  public void setRating(Float rating) {
    this.rating = rating;
  }

  public BookRatings ratingCount(Integer ratingCount) {
    this.ratingCount = ratingCount;
    return this;
  }

  /**
   * Rating count
   * @return ratingCount
  */
  @ApiModelProperty(value = "Rating count")


  public Integer getRatingCount() {
    return ratingCount;
  }

  public void setRatingCount(Integer ratingCount) {
    this.ratingCount = ratingCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookRatings bookRatings = (BookRatings) o;
    return Objects.equals(this.rating, bookRatings.rating) &&
        Objects.equals(this.ratingCount, bookRatings.ratingCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rating, ratingCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookRatings {\n");
    
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    ratingCount: ").append(toIndentedString(ratingCount)).append("\n");
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

