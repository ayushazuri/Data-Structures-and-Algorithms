package ObserverPattern;

public class StatisticalDisplay implements Observer, DisplayElement{
    float temp;
    float humidity;
    float pressure;
    float maxTemp;
    float minTemp;
    float avgTemp;
    Subject weatherData;

    StatisticalDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Max temp: " + maxTemp + " and Min Temp: " + minTemp + "And Avg Temp: " + avgTemp);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        maxTemp = Math.max(this.temp, temp);
        minTemp = Math.min(this.temp, temp);
        avgTemp = (this.temp + temp)/2;
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }
}
