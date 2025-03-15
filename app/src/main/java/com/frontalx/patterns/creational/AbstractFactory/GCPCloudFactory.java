package com.frontalx.patterns.creational.AbstractFactory;

public class GCPCloudFactory implements CloudResourceFactory {
    @Override
    public Storage createStorage() {
        return new GoogleCloudStorage();
    }

    @Override
    public Compute createCompute() {
        return new GoogleComputeEngine();
    }
}