package observer;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 6. 28. initial creation
 */
public class ConcreteObserver implements Observer {
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;

	public ConcreteObserver(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	public void display() {
		System.out.println("현재 기온: " + temperature + "도, 습도: " + humidity + "%, 기압: " + pressure);
		System.out.println(weatherData);
	}

}
