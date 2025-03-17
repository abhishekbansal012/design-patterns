package com.frontalx.patterns.structural.decorator;

public abstract class OrderDecorator implements Order {

    protected Order wrappedOrder;

    public OrderDecorator(Order order) {
        this.wrappedOrder = order;
    }

    @Override
    public String getDescription() {
        return wrappedOrder.getDescription();
    }

    @Override
    public double getTotalPrice() {
        return wrappedOrder.getTotalPrice();
    }

}
