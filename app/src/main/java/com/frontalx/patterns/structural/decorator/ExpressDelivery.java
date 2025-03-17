package com.frontalx.patterns.structural.decorator;

public class ExpressDelivery extends OrderDecorator {

    public ExpressDelivery(Order order) {
        super(order);
    }

    @Override
    public String getDescription() {
        return wrappedOrder.getDescription() + " + Express Delivery";
    }

    @Override
    public double getTotalPrice() {
        return wrappedOrder.getTotalPrice() + 500.0;
    }

}
