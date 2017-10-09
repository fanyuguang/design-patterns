package com.designpatterns.factory.pizzastore;

import com.designpatterns.factory.pizza.NYStyleCheesePizza;
import com.designpatterns.factory.pizza.NYStyleClamPizza;
import com.designpatterns.factory.pizza.Pizza;
import com.designpatterns.factory.pizzastore.PizzaStore;

/**
 * Created by lanling on 11/11/15.
 */
public class NYStylePizzaStore extends PizzaStore {
  public Pizza createPizza(String type) {
    Pizza pizza = null;
    if (type.equals("cheese")) {
      pizza = new NYStyleCheesePizza();
    } else if (type.equals("clam")) {
      pizza = new NYStyleClamPizza();
    }
    return pizza;
  }
}