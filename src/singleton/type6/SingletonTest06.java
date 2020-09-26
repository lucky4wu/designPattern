package singleton.type6;

public class SingletonTest06 {

    public static void main(String... args){
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode="+instance.hashCode());
        System.out.println("instance2.hashCode="+instance2.hashCode());
    }
}

class Singleton {
    private Singleton(){

    }

    public static class SingletonInstance {
        private final static Singleton instance = new Singleton();
    }

    public static  Singleton getInstance(){
        return SingletonInstance.instance;
    }
}
