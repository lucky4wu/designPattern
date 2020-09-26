package absfactory.pizzastore;

import absfactory.pizzastore.order.OrderPizza;

public class PizzaStore {
    public static void main(String... args) {
//        new OrderPizza(new BJFactory());
        new OrderPizza(new LDFactory());
    }
}
