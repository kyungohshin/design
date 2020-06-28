package observer;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 6. 28. initial creation
 */
public class Client {
	public static void main(String[] args) {

		ConcreteSubject weather = new ConcreteSubject();
		ConcreteObserver current1 = new ConcreteObserver(weather);
		ConcreteObserver current2 = new ConcreteObserver(weather);
		ConcreteObserver current3 = new ConcreteObserver(weather);

		weather.setMeasurements(30, 65, 30.4f);
		weather.setMeasurements(29, 64, 30.5f);
		weather.setMeasurements(30, 64, 30.6f);
	}
}
