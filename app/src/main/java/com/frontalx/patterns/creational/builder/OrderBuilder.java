package com.frontalx.patterns.creational.builder;

class OrderBuilder {
  // Required parameters
  private final String orderId;
  private final String customerName;

  // Optional parameters with default values
  private String shippingAddress = "Not Provided";
  private String paymentMethod = "Cash on Delivery";
  private boolean giftWrap = false;
  private String discountCode = "None";

  // Constructor with required parameters
  public OrderBuilder(String orderId, String customerName) {
    this.orderId = orderId;
    this.customerName = customerName;
  }

  // Setter methods for optional fields
  public OrderBuilder setShippingAddress(String shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

  public OrderBuilder setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  public OrderBuilder setGiftWrap(boolean giftWrap) {
    this.giftWrap = giftWrap;
    return this;
  }

  public OrderBuilder setDiscountCode(String discountCode) {
    this.discountCode = discountCode;
    return this;
  }

  // Build method - returns a fully constructed Order object
  public Order build() {
    return new Order(orderId, customerName, shippingAddress, paymentMethod, giftWrap, discountCode);
  }
}
