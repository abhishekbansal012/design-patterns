package com.frontalx.patterns.structural.adapter;

//Adapter for S3
public class S3StorageAdapter implements CloudStorageService{

    private S3Storage s3Storage;
    private String bucketName = "my-s3-bucket";

    public S3StorageAdapter(S3Storage s3Storage) {
        this.s3Storage = s3Storage;
    }

    @Override
    public void uploadFile(String fileName, byte[] data) {
        s3Storage.putObject(bucketName, fileName, data);
    }

}
