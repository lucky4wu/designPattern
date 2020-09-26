package behavior.mediator;

public class TV extends Colleague{
    public void start(){
        System.out.println("打开电视");
    }

    public void stop(){
        System.out.println("关闭电视");
    }

    public TV(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendMessage(int stateChange) {

    }
}
