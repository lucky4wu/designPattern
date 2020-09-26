package absfactory.pizzastore;

import simplefactory.pizzastore.pizza.Pizza;

public interface AbsFactory {
    public Pizza createPizza(String orderType);
}
