package com.anitechcs.orderservice.model;

import java.util.Objects;
import com.anitechcs.orderservice.model.InlineResponse200LinksSelf;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse200Links
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-12-21T12:38:08.640Z[GMT]")
public class InlineResponse200Links   {
  @JsonProperty("self")
  private InlineResponse200LinksSelf self;

  @JsonProperty("first")
  private InlineResponse200LinksSelf first;

  @JsonProperty("prev")
  private InlineResponse200LinksSelf prev;

  @JsonProperty("next")
  private InlineResponse200LinksSelf next;

  @JsonProperty("last")
  private InlineResponse200LinksSelf last;

  public InlineResponse200Links self(InlineResponse200LinksSelf self) {
    this.self = self;
    return this;
  }

  /**
   * Get self
   * @return self
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse200LinksSelf getSelf() {
    return self;
  }

  public void setSelf(InlineResponse200LinksSelf self) {
    this.self = self;
  }

  public InlineResponse200Links first(InlineResponse200LinksSelf first) {
    this.first = first;
    return this;
  }

  /**
   * Get first
   * @return first
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse200LinksSelf getFirst() {
    return first;
  }

  public void setFirst(InlineResponse200LinksSelf first) {
    this.first = first;
  }

  public InlineResponse200Links prev(InlineResponse200LinksSelf prev) {
    this.prev = prev;
    return this;
  }

  /**
   * Get prev
   * @return prev
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse200LinksSelf getPrev() {
    return prev;
  }

  public void setPrev(InlineResponse200LinksSelf prev) {
    this.prev = prev;
  }

  public InlineResponse200Links next(InlineResponse200LinksSelf next) {
    this.next = next;
    return this;
  }

  /**
   * Get next
   * @return next
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse200LinksSelf getNext() {
    return next;
  }

  public void setNext(InlineResponse200LinksSelf next) {
    this.next = next;
  }

  public InlineResponse200Links last(InlineResponse200LinksSelf last) {
    this.last = last;
    return this;
  }

  /**
   * Get last
   * @return last
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse200LinksSelf getLast() {
    return last;
  }

  public void setLast(InlineResponse200LinksSelf last) {
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
    InlineResponse200Links inlineResponse200Links = (InlineResponse200Links) o;
    return Objects.equals(this.self, inlineResponse200Links.self) &&
        Objects.equals(this.first, inlineResponse200Links.first) &&
        Objects.equals(this.prev, inlineResponse200Links.prev) &&
        Objects.equals(this.next, inlineResponse200Links.next) &&
        Objects.equals(this.last, inlineResponse200Links.last);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, first, prev, next, last);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200Links {\n");
    
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

