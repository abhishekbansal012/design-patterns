package com.frontalx.patterns.structural.facade;

public class ShippingService {

    public void shipOrder(String productId, String customerId) {
        System.out.println("Shipping order for product: " + productId + " to customer: " + customerId);
    }

}
