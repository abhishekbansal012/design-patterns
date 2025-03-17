package com.frontalx.patterns.structural.composite;

public class Product implements CatalogComponent {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showDetails() {
        System.out.println("Product: " + name + " | Price: $" + price);
    }

}
