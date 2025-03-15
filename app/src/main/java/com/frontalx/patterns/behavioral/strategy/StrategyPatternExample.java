package com.frontalx.patterns.behavioral.strategy;

public class StrategyPatternExample {

    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay using Credit Card
        context.setPaymentStrategy(new CreditCardPayment());
        context.executePayment(100);

        // Pay using PayPal
        context.setPaymentStrategy(new PayPalPayment());
        context.executePayment(200);
    }

}
