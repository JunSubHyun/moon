package study.moon.book0323;

public class CurrentConditionDisplay implements Observer , DisplayElement{

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    public void display() {
        System.out.println("현재 상태 : 온도 "+temperature + "F , 습도 " + humidity + "%");
    }

//    주제 -> 옵저버
//    public void update(float temperature, float humidity, float pressure) {
//        this.temperature = temperature;
//        this.humidity = humidity;
//        display();
//    }

    // 옵저버 -> 주제
    public void update(){
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
}
