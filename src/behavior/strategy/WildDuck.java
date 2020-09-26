package behavior.strategy;

public class WildDuck extends Duck{
    public WildDuck() {
        this.setFlyBehavior(new GoodFlyBehavior());
    }

    @Override
    public void display() {
        System.out.println("这是野鸭");
    }
}
