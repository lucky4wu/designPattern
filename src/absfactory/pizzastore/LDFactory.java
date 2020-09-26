package absfactory.pizzastore;

import factorymethod.pizzastore.pizza.LDCheesePizza;
import factorymethod.pizzastore.pizza.LDPepperPizza;
import simplefactory.pizzastore.pizza.Pizza;

public class LDFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
