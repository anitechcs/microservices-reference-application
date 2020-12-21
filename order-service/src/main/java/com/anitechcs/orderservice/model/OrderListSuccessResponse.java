package com.anitechcs.orderservice.model;

import java.util.Objects;
import com.anitechcs.orderservice.model.Order;
import com.anitechcs.orderservice.model.OrderListSuccessResponseLinks;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrderListSuccessResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OrderListSuccessResponse   {
  @JsonProperty("statusCode")
  private Integer statusCode;

  @JsonProperty("message")
  private String message;

  @JsonProperty("total")
  private Long total;

  @JsonProperty("_links")
  private OrderListSuccessResponseLinks links;

  @JsonProperty("results")
  @Valid
  private List<Order> results = null;

  public OrderListSuccessResponse statusCode(Integer statusCode) {
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

  public OrderListSuccessResponse message(String message) {
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

  public OrderListSuccessResponse total(Long total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
  */
  @ApiModelProperty(value = "")


  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public OrderListSuccessResponse links(OrderListSuccessResponseLinks links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @ApiModelProperty(value = "")

  @Valid

  public OrderListSuccessResponseLinks getLinks() {
    return links;
  }

  public void setLinks(OrderListSuccessResponseLinks links) {
    this.links = links;
  }

  public OrderListSuccessResponse results(List<Order> results) {
    this.results = results;
    return this;
  }

  public OrderListSuccessResponse addResultsItem(Order resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Get results
   * @return results
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Order> getResults() {
    return results;
  }

  public void setResults(List<Order> results) {
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
    OrderListSuccessResponse orderListSuccessResponse = (OrderListSuccessResponse) o;
    return Objects.equals(this.statusCode, orderListSuccessResponse.statusCode) &&
        Objects.equals(this.message, orderListSuccessResponse.message) &&
        Objects.equals(this.total, orderListSuccessResponse.total) &&
        Objects.equals(this.links, orderListSuccessResponse.links) &&
        Objects.equals(this.results, orderListSuccessResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, message, total, links, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderListSuccessResponse {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

