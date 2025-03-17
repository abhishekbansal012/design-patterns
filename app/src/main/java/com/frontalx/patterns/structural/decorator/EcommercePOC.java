package com.frontalx.patterns.structural.decorator;

public class EcommercePOC {

    public static void main(String[] args) {
        Order order = new ProductOrder("Laptop", 60000); // Base product price
        System.out.println(order.getDescription() + " -> ₹" + order.getTotalPrice());

        // Apply Seasonal Discount
        order = new SeasonalDiscount(order);
        System.out.println(order.getDescription() + " -> ₹" + order.getTotalPrice());

        // Apply GST
        order = new GSTTax(order);
        System.out.println(order.getDescription() + " -> ₹" + order.getTotalPrice());

        // Add Express Delivery
        order = new ExpressDelivery(order);
        System.out.println(order.getDescription() + " -> ₹" + order.getTotalPrice());
    }
}
