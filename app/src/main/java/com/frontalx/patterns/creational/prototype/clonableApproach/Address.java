package com.frontalx.patterns.creational.prototype.clonableApproach;

import java.io.Serializable;

public class Address implements Cloneable {
  private String city;
  private String country;

  public Address(String city, String country) {
    this.city = city;
    this.country = country;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  @Override
  public String toString() {
    return "Address{" +
        "city='" + city + '\'' +
        ", country='" + country + '\'' +
        '}';
  }

  @Override
  protected Address clone() throws CloneNotSupportedException {
    return (Address) super.clone();  // Creates a new Address object
  }
}
