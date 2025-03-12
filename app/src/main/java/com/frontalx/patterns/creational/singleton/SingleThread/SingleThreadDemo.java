package com.frontalx.patterns.creational.singleton.SingleThread;

public class SingleThreadDemo {

  public static void main(String[] args) {
    SingleThreadedSingleton singleton = SingleThreadedSingleton.getInstance("FOO");
    SingleThreadedSingleton anotherSingleton = SingleThreadedSingleton.getInstance("BAR");
    System.out.println(singleton.value);
    System.out.println(anotherSingleton.value);
  }


}
