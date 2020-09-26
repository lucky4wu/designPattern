package absfactory.pizzastore.order;

import absfactory.pizzastore.AbsFactory;
import simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    public AbsFactory factory;

    public OrderPizza(AbsFactory factory) {
        setAbsFactory(factory);
    }

    private void setAbsFactory(AbsFactory factory) {
        Pizza pizza = null;
        String orderType = "";
        this.factory = factory;

        do {
            orderType = getType();

            pizza = factory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
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
