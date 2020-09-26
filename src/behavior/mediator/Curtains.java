package behavior.mediator;

public class Curtains extends Colleague{

    public void up(){
        System.out.println("打开窗帘");
    }

    public void down(){
        System.out.println("关闭窗帘");
    }

    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendMessage(int stateChange) {

    }
}
