package factorymethod.pizzastore.pizza;

import simplefactory.pizzastore.pizza.Pizza;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦胡椒披萨");
        System.out.println("准备伦敦胡椒披萨的材料");
    }
}
