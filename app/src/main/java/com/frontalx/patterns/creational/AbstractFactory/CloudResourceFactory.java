package com.frontalx.patterns.creational.AbstractFactory;

public interface CloudResourceFactory {

    Storage createStorage();
    Compute createCompute();

}
