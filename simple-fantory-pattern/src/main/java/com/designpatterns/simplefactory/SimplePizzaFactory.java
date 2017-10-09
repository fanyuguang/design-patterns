package com.designpatterns.simplefactory;

import com.designpatterns.simplefactory.pizza.CheesePizza;
import com.designpatterns.simplefactory.pizza.ClamPizza;
import com.designpatterns.simplefactory.pizza.Pizza;

/**
 * Created by lanling on 11/11/15.
 */
public class SimplePizzaFactory {
  public Pizza createPizza(String type) {
    Pizza pizza = null;
    if (type.equals("cheese")) {
      pizza = new CheesePizza();
    } else if (type.equals("clam")) {
      pizza = new ClamPizza();
    }
    return pizza;
  }
}