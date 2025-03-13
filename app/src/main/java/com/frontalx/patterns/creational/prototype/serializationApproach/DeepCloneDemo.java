package com.frontalx.patterns.creational.prototype.serializationApproach;

public class DeepCloneDemo {

  public static void main(String[] args) {

    Address address = new Address("New York", "USA");
    Employee original = new Employee("John Doe", 30, address);

    // Deep clone the Employee object
    Employee cloned = (Employee) original.deepClone();

    // Modify the cloned object's address using setter
    cloned.setAddress(new Address("Los Angeles", "USA"));

    // Display the original and cloned object
    System.out.println("Original Employee: " + original);
    System.out.println("Cloned Employee: " + cloned);
  }
}
