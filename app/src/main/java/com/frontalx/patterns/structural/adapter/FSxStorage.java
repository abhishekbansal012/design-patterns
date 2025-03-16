package com.frontalx.patterns.structural.adapter;

//Adaptee - AWS FSx Storage (Existing Service)
public class FSxStorage {

    public void writeFile(String filePath, byte[] data) {
        System.out.println("Writing " + filePath + " to FSx.");
        // FSx SDK logic: fsxClient.writeFile(filePath, data);
    }
}
