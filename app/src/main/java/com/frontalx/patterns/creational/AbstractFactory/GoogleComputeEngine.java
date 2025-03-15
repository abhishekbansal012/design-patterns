package com.frontalx.patterns.creational.AbstractFactory;

public class GoogleComputeEngine implements Compute {
    @Override
    public void runInstance() {
        System.out.println("Running a Google Compute Engine instance");
    }
}
