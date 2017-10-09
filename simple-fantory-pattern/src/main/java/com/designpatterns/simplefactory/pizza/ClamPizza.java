package com.designpatterns.simplefactory.pizza;

import com.designpatterns.simplefactory.pizza.Pizza;

/**
 * Created by lanling on 11/11/15.
 */
public class ClamPizza extends Pizza {
  public void prepare() {
    System.out.println("clam prepare");
  }

  public void bake() {
    System.out.println("clam bake");
  }

  public void cut() {
    System.out.println("clam cut");
  }

  public void box() {
    System.out.println("clam box");
  }
}