package behavior.mediator;

public class CoffeeMachine extends Colleague{
    public void start(){
        System.out.println("打开咖啡机");
    }
    public void stop(){
        System.out.println("关闭咖啡机");
    }

    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.getName());
    }

    public void finishCoffee(){
        sendMessage(0);
    }
}
