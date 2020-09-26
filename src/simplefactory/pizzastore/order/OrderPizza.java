package simplefactory.pizzastore.order;

import simplefactory.pizzastore.improve.SimpleFactory;
import simplefactory.pizzastore.pizza.CheesePizza;
import simplefactory.pizzastore.pizza.GreekPizza;
import simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    public OrderPizza(){
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            pizza = SimpleFactory.createPizza(orderType);
            if (pizza != null){
                // 输出pizza 制作过程
                pizza.setName(orderType + "披萨");
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                break;
            }
        } while (true);
    }

    private String getType(){
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type: ");
            String str = bf.readLine();
            return str;
        } catch (IOException e){
            e.printStackTrace();
            return "";
        }
    }
}
