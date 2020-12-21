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
 * Book promotion details
 */
@ApiModel(description = "Book promotion details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-12-21T12:56:51.345Z[GMT]")
public class BookPromotions   {
  @JsonProperty("text")
  private String text;

  @JsonProperty("color")
  private String color;

  public BookPromotions text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Text to show in UI
   * @return text
  */
  @ApiModelProperty(example = "15% off", value = "Text to show in UI")


  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public BookPromotions color(String color) {
    this.color = color;
    return this;
  }

  /**
   * Color of the promotion badge in UI
   * @return color
  */
  @ApiModelProperty(example = "#0D47A1", value = "Color of the promotion badge in UI")


  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookPromotions bookPromotions = (BookPromotions) o;
    return Objects.equals(this.text, bookPromotions.text) &&
        Objects.equals(this.color, bookPromotions.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, color);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookPromotions {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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

