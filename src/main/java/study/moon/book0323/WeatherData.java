package study.moon.book0323;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class WeatherData implements Subject{

    private List<Observer> observers;

    private float temperature;

    private float humidity;

    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        observers.remove(o);
    }

    // 주제 -> 옵저버
//    public void notifyObservers() {
//        for (Observer observer : observers){
//            observer.update(temperature, humidity, pressure);
//        }
//    }

    // 옵저버 -> 주제
    public void notifyObservers(){
        for (Observer observer: observers){
            observer.update();
        }

    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
