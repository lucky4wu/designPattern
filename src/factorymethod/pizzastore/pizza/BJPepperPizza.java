package factorymethod.pizzastore.pizza;

import simplefactory.pizzastore.pizza.Pizza;

public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京胡椒披萨");
        System.out.println("准备北京胡椒披萨的材料");
    }
}
