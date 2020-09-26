package behavior.observer;

public class CurrentConditions implements Observer{

    private float temperature;
    private float pressure;
    private float humidity;

    public void update(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    private void display() {
        System.out.println("temperature:"+temperature);
        System.out.println("pressure:"+pressure);
        System.out.println("humidity:"+humidity);
    }
}
