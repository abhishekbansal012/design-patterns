package com.frontalx.patterns.structural.facade;

public class InventoryService {

    public boolean checkStock(String productId) {
        System.out.println("Checking stock for product: " + productId);
        return true; // Assume product is available
    }

}
