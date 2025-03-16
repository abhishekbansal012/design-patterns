package com.frontalx.patterns.structural.adapter;

public class FSxStorageAdapter implements CloudStorageService {
    private FSxStorage fsxStorage;
    private String basePath = "/mnt/fsx/";

    public FSxStorageAdapter(FSxStorage fsxStorage) {
        this.fsxStorage = fsxStorage;
    }

    @Override
    public void uploadFile(String fileName, byte[] data) {
        fsxStorage.writeFile(basePath + fileName, data);
    }
}
