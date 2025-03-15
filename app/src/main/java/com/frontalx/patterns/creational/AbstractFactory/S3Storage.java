package com.frontalx.patterns.creational.AbstractFactory;

public class S3Storage implements Storage {

    @Override
    public void store(String data) {
        System.out.println("Storing data in AWS S3: " + data);
    }

}
