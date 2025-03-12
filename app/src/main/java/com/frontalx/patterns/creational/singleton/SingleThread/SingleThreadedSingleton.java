package com.frontalx.patterns.creational.singleton.SingleThread;

public final class SingleThreadedSingleton {

  private static SingleThreadedSingleton instance;

  public String value;

  private SingleThreadedSingleton(String value) {
    this.value = value;
  }

  public static SingleThreadedSingleton getInstance(String value) {
    if (instance == null) {
      instance = new SingleThreadedSingleton(value);
    }
    return instance;
  }
}
