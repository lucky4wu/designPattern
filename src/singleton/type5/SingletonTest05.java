package singleton.type5;

public class SingletonTest05 {

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
    private static volatile Singleton instance;

    public static  Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
