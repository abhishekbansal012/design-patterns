package com.frontalx.patterns.structural.adapter;

//Adaptee - AWS S3 Storage (Existing Service)
public class S3Storage {

    public void putObject(String bucketName, String key, byte[] data) {
        System.out.println("Uploading " + key + " to S3 bucket: " + bucketName);
        // S3 SDK logic: s3Client.putObject(new PutObjectRequest(bucketName, key, data));
    }

}
