package behavior.mediator;

public abstract class Colleague {
    private Mediator mediator;
    private String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void sendMessage(int stateChange);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
