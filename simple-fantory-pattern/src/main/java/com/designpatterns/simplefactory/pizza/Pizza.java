package com.designpatterns.simplefactory.pizza;

/**
 * Created by lanling on 11/11/15.
 */
public abstract class Pizza {
  public void prepare() {
    System.out.println("prepare");
  }

  public void bake() {
    System.out.println("bake");
  }

  public void cut() {
    System.out.println("cut");
  }

  public void box() {
    System.out.println("box");
  }
}