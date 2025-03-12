package com.frontalx.patterns.creational.singleton.MultiThread;

public class MultiThreadDemo {

  public static void main(String[] args) {
    System.out.println("same value -> then singleton was reused" + "\n" +
        "If different values, then 2 singletons were created." + "\n");
    Thread threadFoo = new Thread(new ThreadFoo());
    Thread threadBar = new Thread(new ThreadBar());
    threadFoo.start();
    threadBar.start();
  }

  static class ThreadFoo implements Runnable {
    @Override
    public void run() {
      NonSafeMultiThreadedSingleton singleton = NonSafeMultiThreadedSingleton.getInstance("FOO");
      System.out.println(singleton.value);
    }
  }

  static class ThreadBar implements Runnable {
    @Override
    public void run() {
      NonSafeMultiThreadedSingleton singleton = NonSafeMultiThreadedSingleton.getInstance("BAR");
      System.out.println(singleton.value);
    }
  }


}
