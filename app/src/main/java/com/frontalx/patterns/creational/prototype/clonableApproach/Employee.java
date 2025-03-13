package com.frontalx.patterns.creational.prototype.clonableApproach;

import com.frontalx.patterns.creational.prototype.serializationApproach.Prototype;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Employee implements Cloneable  {

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
  protected Employee clone() throws CloneNotSupportedException {
    Employee cloned = (Employee) super.clone();  // Shallow copy
    cloned.address = address.clone();  // Deep clone the Address object
    return cloned;
  }

  @Override
  public String toString() {
    return "Employee{" + "name='" + name + '\'' + ", age=" + age + ", address=" + address + '}';
  }
}
