package behavior.strategy;

public class PekingDuck extends Duck{

    public PekingDuck() {
        this.setFlyBehavior(new BadFlyBehavior());
    }

    @Override
    public void display() {
        System.out.println("这是北京鸭");
    }
}
