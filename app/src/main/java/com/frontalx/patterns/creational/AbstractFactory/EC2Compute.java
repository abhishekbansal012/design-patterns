package com.frontalx.patterns.creational.AbstractFactory;

public class EC2Compute implements Compute {
    @Override
    public void runInstance() {
        System.out.println("Running an AWS EC2 instance");
    }
}
