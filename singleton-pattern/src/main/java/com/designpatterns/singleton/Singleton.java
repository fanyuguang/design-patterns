package com.designpatterns.singleton;

/**
 * Created by lanling on 11/17/15.
 */
public class Singleton {
  private static Singleton uniqueInstance;

  private Singleton() {};
  public static synchronized Singleton getInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new Singleton();
    }
    return uniqueInstance;
  }
}
