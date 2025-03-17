package com.frontalx.patterns.structural.decorator;

public class SeasonalDiscount extends OrderDecorator {

    public SeasonalDiscount(Order order) {
        super(order);
    }

    @Override
    public String getDescription() {
        return wrappedOrder.getDescription() + " + Seasonal Discount (15%)";
    }

    @Override
    public double getTotalPrice() {
        return wrappedOrder.getTotalPrice() * 0.85; // 15% discount
    }
}
