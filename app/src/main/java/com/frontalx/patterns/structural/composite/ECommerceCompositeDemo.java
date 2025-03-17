package com.frontalx.patterns.structural.composite;

public class ECommerceCompositeDemo {

    public static void main(String[] args) {

        Product laptop = new Product("Laptop", 1200);
        Product phone = new Product("Smartphone", 800);

        Category electronics = new Category("Electronics");
        electronics.add(laptop);
        electronics.add(phone);

        Product jeans = new Product("Jeans", 50);
        Product tshirt = new Product("T-Shirt", 20);

        Category clothing = new Category("Clothing");
        clothing.add(jeans);
        clothing.add(tshirt);

        Category mainCatalog = new Category("Main Catalog");
        mainCatalog.add(electronics);
        mainCatalog.add(clothing);

        // Display the entire catalog
        mainCatalog.showDetails();
    }

}
