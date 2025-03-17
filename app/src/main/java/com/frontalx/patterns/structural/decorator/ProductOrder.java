package com.frontalx.patterns.structural.decorator;

public class ProductOrder implements Order {

    private String productName;
    private double basePrice;

    public ProductOrder(String productName, double basePrice) {
        this.productName = productName;
        this.basePrice = basePrice;
    }

    @Override
    public String getDescription() {
        return "Product: " + productName;
    }

    @Override
    public double getTotalPrice() {
        return basePrice;
    }

}
