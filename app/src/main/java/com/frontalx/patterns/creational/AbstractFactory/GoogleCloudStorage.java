package com.frontalx.patterns.creational.AbstractFactory;

public class GoogleCloudStorage implements Storage {
    @Override
    public void store(String data) {
        System.out.println("Storing data in Google Cloud Storage: " + data);
    }
}
