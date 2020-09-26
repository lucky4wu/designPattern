package simplefactory.pizzastore.improve;

import simplefactory.pizzastore.pizza.CheesePizza;
import simplefactory.pizzastore.pizza.GreekPizza;
import simplefactory.pizzastore.pizza.Pizza;

public class SimpleFactory {


    public static Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("greek")){
            pizza = new GreekPizza();
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
        }
        return pizza;
    }
}
