package com.frontalx.patterns.creational.AbstractFactory;

public class BlobStorage implements Storage {
    @Override
    public void store(String data) {
        System.out.println("Storing data in Azure Blob Storage: " + data);
    }
}
