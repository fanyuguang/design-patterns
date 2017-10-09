package com.designpatterns.simplefactory.pizza;

import com.designpatterns.simplefactory.pizza.Pizza;

/**
 * Created by lanling on 11/11/15.
 */
public class CheesePizza extends Pizza {
  public void prepare() {
    System.out.println("cheese prepare");
  }

  public void bake() {
    System.out.println("cheese bake");
  }

  public void cut() {
    System.out.println("cheese cut");
  }

  public void box() {
    System.out.println("cheese box");
  }
}