package com.frontalx.patterns.creational.AbstractFactory;

public class AzureCloudFactory implements CloudResourceFactory {
    @Override
    public Storage createStorage() {
        return new BlobStorage();
    }

    @Override
    public Compute createCompute() {
        return new AzureVMCompute();
    }
}
