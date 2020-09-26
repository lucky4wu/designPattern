package behavior.observer;

public interface Subject {

    public void registerObserver(Observer observer);

    public void remove(Observer observer);
    public void notifyObservers();
}
