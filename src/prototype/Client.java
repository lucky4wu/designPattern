package prototype;

public class Client {

    public static void main(String... args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("tom",1,"白色");
        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();
        Sheep sheep5 = (Sheep) sheep.clone();

        System.out.println(sheep.hashCode()+sheep.toString());
        System.out.println(sheep1.hashCode()+sheep.toString());
        System.out.println(sheep2.hashCode()+sheep.toString());
        System.out.println(sheep3.hashCode()+sheep.toString());
        System.out.println(sheep4.hashCode()+sheep.toString());
        System.out.println(sheep5.hashCode()+sheep.toString());
    }
}
