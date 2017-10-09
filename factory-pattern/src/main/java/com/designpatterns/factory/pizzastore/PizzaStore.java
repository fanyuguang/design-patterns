package com.designpatterns.factory.pizzastore;

import com.designpatterns.factory.pizza.Pizza;

/**
 * Created by lanling on 11/11/15.
 */
abstract class PizzaStore {
  public Pizza orderPizza(String type) {
    Pizza pizza;
    pizza = createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }

  abstract Pizza createPizza(String type);
}