package behavior.memento;

public class Originator {

    private String state;
    private String name;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento){
        this.state = memento.getState();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
