package com.frontalx.patterns.creational.AbstractFactory;

public class AWSCloudFactory implements CloudResourceFactory {
    @Override
    public Storage createStorage() {
        return new S3Storage();
    }

    @Override
    public Compute createCompute() {
        return new EC2Compute();
    }
}
