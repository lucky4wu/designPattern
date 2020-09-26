package structural.decorator;

public class CoffeeBar {
    public static void main(String[] args) {
        Drink order = new Decaf();
        System.out.println(order.cost());
        System.out.println(order.getDes());

        order = new Milk(order);
        System.out.println(order.cost());
        System.out.println(order.getDes());

        order = new Chocolate(order);
        System.out.println(order.cost());
        System.out.println(order.getDes());

        order = new Chocolate(order);
        System.out.println(order.cost());
        System.out.println(order.getDes());
    }
}
