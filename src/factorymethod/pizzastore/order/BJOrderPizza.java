package factorymethod.pizzastore.order;

import factorymethod.pizzastore.pizza.BJCheesePizza;
import factorymethod.pizzastore.pizza.BJPepperPizza;
import simplefactory.pizzastore.pizza.Pizza;

public class BJOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
