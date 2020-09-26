package structural.decorator;

public class Chocolate extends Decorator {

    public Chocolate(Drink obj) {
        super(obj);
        setDes(" 巧克力 ");
        setPrice(3);
    }
}
