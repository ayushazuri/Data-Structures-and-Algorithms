package ObserverPattern;

import java.util.ArrayList;

public class WeatherData implements Subject{

    ArrayList<Observer> observers;
    float temp;
    float humidity;
    float pressure;

    WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i >= 0)
            observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observers){
            observer.update(temp, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
