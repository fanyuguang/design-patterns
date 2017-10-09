package com.designpatterns.simplefactory;

import com.designpatterns.simplefactory.pizza.Pizza;

/**
 * Created by lanling on 11/11/15.
 */
public class PizzaStore {
  private SimplePizzaFactory simplePizzaFactory;

  public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
    this.simplePizzaFactory = simplePizzaFactory;
  }

  public Pizza orderPizza(String type) {
    Pizza pizza;
    pizza = simplePizzaFactory.createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }
}