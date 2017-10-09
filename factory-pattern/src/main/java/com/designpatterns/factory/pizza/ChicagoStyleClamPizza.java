package com.designpatterns.factory.pizza;

import com.designpatterns.factory.pizza.Pizza;

/**
 * Created by lanling on 11/18/15.
 */
public class ChicagoStyleClamPizza extends Pizza {
  public ChicagoStyleClamPizza() {
    setName("Chicago Strle Deep Dish Clam Pizza");
    setDough("Extra Thick Crust Dough");
    setSauce("Plum Tomato Sauce");
    addTopping("Shredded Mozzarella Clam");
  }

  public void cut() {
    System.out.println("Cutting the pizza into square slices");
  }
}