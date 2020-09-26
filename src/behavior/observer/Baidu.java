package behavior.observer;

public class Baidu implements Observer{

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
        System.out.println("百度temperature:"+temperature);
        System.out.println("百度pressure:"+pressure);
        System.out.println("百度humidity:"+humidity);
    }
}
