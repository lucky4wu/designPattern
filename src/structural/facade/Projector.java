package structural.facade;

public class Projector {

    private static Projector instance = new Projector();

    public static Projector getInstance(){
        return instance;
    }

    public void on(){
        System.out.println(" Projector on");
    }

    public void off(){
        System.out.println(" Projector off");
    }

    public void play(){
        System.out.println(" Projector play");
    }

    public void pause(){
        System.out.println(" Projector pause");
    }
}
