package com.frontalx.patterns.structural.adapter;

public class AWSAdapterPatternExample {

    public static void main(String[] args) {
        byte[] fileData = "Hello, AWS!".getBytes();

        // Using S3
        CloudStorageService s3Service = new S3StorageAdapter(new S3Storage());
        s3Service.uploadFile("file1.txt", fileData);

        // Using FSx
        CloudStorageService fsxService = new FSxStorageAdapter(new FSxStorage());
        fsxService.uploadFile("file2.txt", fileData);
    }

}
