package com.frontalx.patterns.creational.builder;

class Order {
  // Required fields
  private final String orderId;
  private final String customerName;

  // Optional fields
  private final String shippingAddress;
  private final String paymentMethod;
  private final boolean giftWrap;
  private final String discountCode;

  // Private constructor - can only be instantiated via Builder
  private Order(String orderId, String customerName, String shippingAddress,
                String paymentMethod, boolean giftWrap, String discountCode) {
    this.orderId = orderId;
    this.customerName = customerName;
    this.shippingAddress = shippingAddress;
    this.paymentMethod = paymentMethod;
    this.giftWrap = giftWrap;
    this.discountCode = discountCode;
  }

  // Getters (No Setters - Immutable)
  public String getOrderId() { return orderId; }
  public String getCustomerName() { return customerName; }
  public String getShippingAddress() { return shippingAddress; }
  public String getPaymentMethod() { return paymentMethod; }
  public boolean isGiftWrap() { return giftWrap; }
  public String getDiscountCode() { return discountCode; }

  @Override
  public String toString() {
    return "Order [Order ID=" + orderId + ", Customer=" + customerName +
        ", Address=" + shippingAddress + ", Payment=" + paymentMethod +
        ", Gift Wrap=" + giftWrap + ", Discount Code=" + discountCode + "]";
  }
}
