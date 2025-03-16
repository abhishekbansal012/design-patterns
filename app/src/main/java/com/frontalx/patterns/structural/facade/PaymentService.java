package com.frontalx.patterns.structural.facade;

public class PaymentService {

    public boolean processPayment(String customerId, double amount) {
        System.out.println("Processing payment of ₹" + amount + " for customer: " + customerId);
        return true; // Assume payment is successful
    }

}
