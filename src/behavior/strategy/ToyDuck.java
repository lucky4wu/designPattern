package behavior.strategy;

public class ToyDuck extends Duck{

    public ToyDuck() {
        this.setFlyBehavior(new NoFlyBehavior());
    }

    @Override
    public void display() {
        System.out.println("这是玩具鸭子");
    }
}
