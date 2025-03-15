package com.frontalx.patterns.creational.AbstractFactory;

public class AzureVMCompute implements Compute {
    @Override
    public void runInstance() {
        System.out.println("Running an Azure Virtual Machine");
    }
}
