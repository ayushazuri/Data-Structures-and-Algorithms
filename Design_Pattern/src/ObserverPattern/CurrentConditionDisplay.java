package ObserverPattern;

public class CurrentConditionDisplay implements Observer, DisplayElement{
    float temp;
    float humidity;
    float pressure;
    Subject weatherData;

    CurrentConditionDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: " + temp +  "F degrees and " + humidity + "% humidity and" + pressure + " pressure");
    }
}
