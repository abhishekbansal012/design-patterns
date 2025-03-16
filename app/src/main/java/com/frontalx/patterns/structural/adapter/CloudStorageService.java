package com.frontalx.patterns.structural.adapter;

//Common Interface (Target)
public interface CloudStorageService {

    void uploadFile(String fileName, byte[] data);
}
