package absfactory.pizzastore;

import factorymethod.pizzastore.pizza.BJCheesePizza;
import factorymethod.pizzastore.pizza.BJPepperPizza;
import factorymethod.pizzastore.pizza.LDCheesePizza;
import factorymethod.pizzastore.pizza.LDPepperPizza;
import simplefactory.pizzastore.pizza.Pizza;

public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
