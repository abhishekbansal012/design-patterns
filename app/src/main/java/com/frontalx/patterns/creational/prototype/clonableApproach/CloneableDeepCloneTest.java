package com.frontalx.patterns.creational.prototype.clonableApproach;

public class CloneableDeepCloneTest {

  public static void main(String[] args) throws CloneNotSupportedException {
    Address address = new Address("New York", "USA");
    Employee original = new Employee("John Doe", 12, address);

    // Deep clone the Employee object
    Employee cloned = original.clone();

    // Modify cloned object's address (should not affect original)
    cloned.setAddress(new Address("Los Angeles", "USA"));

    // Display the original and cloned object
    System.out.println("Original Employee: " + original);
    System.out.println("Cloned Employee: " + cloned);
  }
}
