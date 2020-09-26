package factorymethod.pizzastore.pizza;

import simplefactory.pizzastore.pizza.Pizza;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.out.println("准备北京奶酪披萨的材料");
    }
}
