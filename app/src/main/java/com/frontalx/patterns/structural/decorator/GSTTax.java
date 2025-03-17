package com.frontalx.patterns.structural.decorator;

public class GSTTax extends OrderDecorator {

    public GSTTax(Order order) {
        super(order);
    }

    @Override
    public String getDescription() {
        return wrappedOrder.getDescription() + " + GST (18%)";
    }

    @Override
    public double getTotalPrice() {
        return wrappedOrder.getTotalPrice() * 1.18; // 18% GST
    }
}
