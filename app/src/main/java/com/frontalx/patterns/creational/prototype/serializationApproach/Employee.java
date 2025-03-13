package com.frontalx.patterns.creational.prototype.serializationApproach;

import java.io.*;

public class Employee implements Prototype {

  private String name;
  private int age;
  private Address address;

  public Employee(String name, int age, Address address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  @Override
  public Prototype deepClone() {
    try {
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      ObjectOutputStream oos = new ObjectOutputStream(bos);
      oos.writeObject(this);
      oos.flush();

      ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
      ObjectInputStream ois = new ObjectInputStream(bis);
      return (Prototype) ois.readObject();
    } catch (IOException | ClassNotFoundException e) {
      throw new RuntimeException("Deep cloning failed", e);
    }
  }

  @Override
  public String toString() {
    return "Employee{" + "name='" + name + '\'' + ", age=" + age + ", address=" + address + '}';
  }
}
