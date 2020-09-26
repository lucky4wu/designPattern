package behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private float temperature;
    private float pressure;
    private float humidity;

    private List<Observer> observerList;

    public WeatherData() {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        if (observerList.contains(observer)){
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observerList){
            o.update(this.temperature, this.pressure, this.humidity);
        }
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
}
