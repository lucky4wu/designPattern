package behavior.memento;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setName("勇者");
        Caretaker caretaker = new Caretaker();

        originator.setState("状态#1");
        caretaker.add(originator.saveStateMemento());

        originator.setState("状态#2");
        caretaker.add(originator.saveStateMemento());

        originator.setState("状态#3");
        caretaker.add(originator.saveStateMemento());

        System.out.println(originator.getState());

        originator.getStateFromMemento(caretaker.get(0));
        System.out.println(originator.getState());
        System.out.println(originator.getName());
    }
}
