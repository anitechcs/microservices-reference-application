package com.anitechcs.bookservice.model;

import java.util.Objects;
import com.anitechcs.bookservice.model.Book;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2001
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-12-21T12:56:51.345Z[GMT]")
public class InlineResponse2001   {
  @JsonProperty("statusCode")
  private Integer statusCode;

  @JsonProperty("message")
  private String message;

  @JsonProperty("results")
  private Book results;

  public InlineResponse2001 statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * Get statusCode
   * @return statusCode
  */
  @ApiModelProperty(value = "")


  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public InlineResponse2001 message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  @ApiModelProperty(value = "")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public InlineResponse2001 results(Book results) {
    this.results = results;
    return this;
  }

  /**
   * Get results
   * @return results
  */
  @ApiModelProperty(value = "")

  @Valid

  public Book getResults() {
    return results;
  }

  public void setResults(Book results) {
    this.results = results;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(this.statusCode, inlineResponse2001.statusCode) &&
        Objects.equals(this.message, inlineResponse2001.message) &&
        Objects.equals(this.results, inlineResponse2001.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, message, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

