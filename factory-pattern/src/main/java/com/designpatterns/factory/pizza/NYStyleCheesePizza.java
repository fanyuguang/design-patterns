package com.designpatterns.factory.pizza;

import com.designpatterns.factory.pizza.Pizza;

/**
 * Created by lanling on 11/11/15.
 */
public class NYStyleCheesePizza extends Pizza {
  public NYStyleCheesePizza() {
    setName("NY Strle Cheese Pizza");
    setDough("Thin Crust Dough");
    setSauce("Marinara Sauce");
    addTopping("Grated Reggiano Cheese");
  }
}