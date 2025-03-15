package com.frontalx.patterns.creational.AbstractFactory;

public class CloudServiceClient {

    private Storage storage;
    private Compute compute;

    public CloudServiceClient(CloudResourceFactory factory) {
        this.storage = factory.createStorage();
        this.compute = factory.createCompute();
    }

    public void performOperations() {
        storage.store("Application Data");
        compute.runInstance();
    }

    public static void main(String[] args) {
        // Choose a cloud provider
        CloudResourceFactory factory = new AWSCloudFactory(); // Can be changed to AzureCloudFactory or GCPCloudFactory
        CloudServiceClient client = new CloudServiceClient(factory);

        client.performOperations();
    }

}
