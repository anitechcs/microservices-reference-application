package com.anitechcs.orderservice.model;

import java.util.Objects;
import com.anitechcs.orderservice.model.OrderListSuccessResponseLinksSelf;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrderListSuccessResponseLinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OrderListSuccessResponseLinks   {
  @JsonProperty("self")
  private OrderListSuccessResponseLinksSelf self;

  @JsonProperty("first")
  private OrderListSuccessResponseLinksSelf first;

  @JsonProperty("prev")
  private OrderListSuccessResponseLinksSelf prev;

  @JsonProperty("next")
  private OrderListSuccessResponseLinksSelf next;

  @JsonProperty("last")
  private OrderListSuccessResponseLinksSelf last;

  public OrderListSuccessResponseLinks self(OrderListSuccessResponseLinksSelf self) {
    this.self = self;
    return this;
  }

  /**
   * Get self
   * @return self
  */
  @ApiModelProperty(value = "")

  @Valid

  public OrderListSuccessResponseLinksSelf getSelf() {
    return self;
  }

  public void setSelf(OrderListSuccessResponseLinksSelf self) {
    this.self = self;
  }

  public OrderListSuccessResponseLinks first(OrderListSuccessResponseLinksSelf first) {
    this.first = first;
    return this;
  }

  /**
   * Get first
   * @return first
  */
  @ApiModelProperty(value = "")

  @Valid

  public OrderListSuccessResponseLinksSelf getFirst() {
    return first;
  }

  public void setFirst(OrderListSuccessResponseLinksSelf first) {
    this.first = first;
  }

  public OrderListSuccessResponseLinks prev(OrderListSuccessResponseLinksSelf prev) {
    this.prev = prev;
    return this;
  }

  /**
   * Get prev
   * @return prev
  */
  @ApiModelProperty(value = "")

  @Valid

  public OrderListSuccessResponseLinksSelf getPrev() {
    return prev;
  }

  public void setPrev(OrderListSuccessResponseLinksSelf prev) {
    this.prev = prev;
  }

  public OrderListSuccessResponseLinks next(OrderListSuccessResponseLinksSelf next) {
    this.next = next;
    return this;
  }

  /**
   * Get next
   * @return next
  */
  @ApiModelProperty(value = "")

  @Valid

  public OrderListSuccessResponseLinksSelf getNext() {
    return next;
  }

  public void setNext(OrderListSuccessResponseLinksSelf next) {
    this.next = next;
  }

  public OrderListSuccessResponseLinks last(OrderListSuccessResponseLinksSelf last) {
    this.last = last;
    return this;
  }

  /**
   * Get last
   * @return last
  */
  @ApiModelProperty(value = "")

  @Valid

  public OrderListSuccessResponseLinksSelf getLast() {
    return last;
  }

  public void setLast(OrderListSuccessResponseLinksSelf last) {
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
    OrderListSuccessResponseLinks orderListSuccessResponseLinks = (OrderListSuccessResponseLinks) o;
    return Objects.equals(this.self, orderListSuccessResponseLinks.self) &&
        Objects.equals(this.first, orderListSuccessResponseLinks.first) &&
        Objects.equals(this.prev, orderListSuccessResponseLinks.prev) &&
        Objects.equals(this.next, orderListSuccessResponseLinks.next) &&
        Objects.equals(this.last, orderListSuccessResponseLinks.last);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, first, prev, next, last);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderListSuccessResponseLinks {\n");
    
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

