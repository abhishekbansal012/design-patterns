package com.frontalx.patterns.structural.facade;

public class NotificationService {

    public void sendOrderConfirmation(String customerId) {
        System.out.println("Sending order confirmation to customer: " + customerId);
    }

}
