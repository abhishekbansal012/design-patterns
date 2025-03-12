package com.frontalx.patterns.creational.singleton.MultiThread;

public final class NonSafeMultiThreadedSingleton {

  private static NonSafeMultiThreadedSingleton instance;

  public String value;

  private NonSafeMultiThreadedSingleton(String value) {
    this.value = value;
  }

  public static NonSafeMultiThreadedSingleton getInstance(String value) {
    if (instance == null) {
      instance = new NonSafeMultiThreadedSingleton(value);
    }
    return instance;
  }
}
