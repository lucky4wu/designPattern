package factorymethod.pizzastore.pizza;

import simplefactory.pizzastore.pizza.Pizza;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦芝士披萨");
        System.out.println("准备伦敦芝士披萨的材料");
    }
}
