import java.util.Observable;
import java.util.Observer;



class WeatherData extends Observable {
    private float temperature;

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        setChanged(); // Đánh dấu trạng thái đã thay đổi
        notifyObservers(temperature); // Thông báo cho các observer
    }
}

class CurrentConditionsDisplay implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Current temperature: " + arg + "°C");
    }
}

class TestObserver implements Observer {
    public static int index = 0;
    @Override
    public void update(Observable o, Object arg) {
        index+=1;
        System.out.println("Test observer: " + index);
    }
}

public class observable {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        TestObserver testObserver = new TestObserver();

        weatherData.addObserver(currentDisplay);
        weatherData.addObserver(testObserver);

        weatherData.setTemperature(25.5f);
        weatherData.setTemperature(30.0f);

    }
}
