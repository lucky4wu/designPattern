package behavior.observer;

public class Client {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer observer = new CurrentConditions();
        Baidu baidu = new Baidu();
        weatherData.registerObserver(observer);
        weatherData.registerObserver(baidu);

        weatherData.setTemperature(30);
        weatherData.setPressure(100);
        weatherData.setHumidity(41.4f);

        weatherData.notifyObservers();
    }
}
