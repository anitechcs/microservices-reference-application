package com.anitechcs.orderservice.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.openapitools.jackson.nullable.JsonNullable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Shipping address of the order
 */
@Entity
@ApiModel(description = "Shipping address of the order")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OrderAddress   {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long addressId;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("addressLine")
  private String addressLine;

  @JsonProperty("city")
  private String city;

  @JsonProperty("zip")
  private Long zip;

  @JsonProperty("phone")
  private String phone;

  @JsonProperty("email")
  private String email;

  public OrderAddress firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name
   * @return firstName
  */
  @ApiModelProperty(value = "First name")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public OrderAddress lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name
   * @return lastName
  */
  @ApiModelProperty(value = "Last name")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public OrderAddress addressLine(String addressLine) {
    this.addressLine = addressLine;
    return this;
  }

  /**
   * Address Line 1
   * @return addressLine
  */
  @ApiModelProperty(value = "Address Line 1")


  public String getAddressLine() {
    return addressLine;
  }

  public void setAddressLine(String addressLine) {
    this.addressLine = addressLine;
  }

  public OrderAddress city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City
   * @return city
  */
  @ApiModelProperty(value = "City")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public OrderAddress zip(Long zip) {
    this.zip = zip;
    return this;
  }

  /**
   * Zip code
   * @return zip
  */
  @ApiModelProperty(value = "Zip code")


  public Long getZip() {
    return zip;
  }

  public void setZip(Long zip) {
    this.zip = zip;
  }

  public OrderAddress phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Phone number
   * @return phone
  */
  @ApiModelProperty(value = "Phone number")


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public OrderAddress email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email address
   * @return email
  */
  @ApiModelProperty(value = "Email address")

@javax.validation.constraints.Email
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderAddress orderAddress = (OrderAddress) o;
    return Objects.equals(this.firstName, orderAddress.firstName) &&
        Objects.equals(this.lastName, orderAddress.lastName) &&
        Objects.equals(this.addressLine, orderAddress.addressLine) &&
        Objects.equals(this.city, orderAddress.city) &&
        Objects.equals(this.zip, orderAddress.zip) &&
        Objects.equals(this.phone, orderAddress.phone) &&
        Objects.equals(this.email, orderAddress.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, addressLine, city, zip, phone, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderAddress {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

