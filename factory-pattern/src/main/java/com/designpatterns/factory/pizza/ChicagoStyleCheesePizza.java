package com.designpatterns.factory.pizza;

import com.designpatterns.factory.pizza.Pizza;

/**
 * Created by lanling on 11/18/15.
 */
public class ChicagoStyleCheesePizza extends Pizza {
  public ChicagoStyleCheesePizza() {
    setName("Chicago Strle Deep Dish Cheese Pizza");
    setDough("Extra Thick Crust Dough");
    setSauce("Plum Tomato Sauce");
    addTopping("Shredded Mozzarella Cheese");
  }

  public void cut() {
    System.out.println("Cutting the pizza into square slices");
  }
}
