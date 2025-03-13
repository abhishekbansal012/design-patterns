package com.frontalx.patterns.creational.builder;

public class EcommerceOrderExample {

  public static void main(String[] args) {

    // Creating a basic order with only required fields
    Order basicOrder = new OrderBuilder("ORD12345", "John Doe").build();

    // Creating a premium order with shipping and payment method
    Order premiumOrder = new OrderBuilder("ORD56789", "Alice Smith")
        .setShippingAddress("123, Main Street, NY")
        .setPaymentMethod("Credit Card")
        .build();

    // Creating a gift order with discount code
    Order giftOrder = new OrderBuilder("ORD98765", "Bob Johnson")
        .setShippingAddress("456, Park Avenue, LA")
        .setGiftWrap(true)
        .setDiscountCode("HOLIDAY50")
        .build();

    // Print the orders
    System.out.println(basicOrder);
    System.out.println(premiumOrder);
    System.out.println(giftOrder);
  }
}
