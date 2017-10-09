package com.designpatterns.factory.pizzastore;

import com.designpatterns.factory.pizza.ChicagoStyleCheesePizza;
import com.designpatterns.factory.pizza.ChicagoStyleClamPizza;
import com.designpatterns.factory.pizza.Pizza;
import com.designpatterns.factory.pizzastore.PizzaStore;

/**
 * Created by lanling on 11/11/15.
 */
public class ChicagoStylePizzaStore extends PizzaStore {
  public Pizza createPizza(String type) {
    Pizza pizza = null;
    if (type.equals("cheese")) {
      pizza = new ChicagoStyleCheesePizza();
    } else if (type.equals("clam")) {
      pizza = new ChicagoStyleClamPizza();
    }
    return pizza;
  }
}