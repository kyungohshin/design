package observer;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 6. 28. initial creation
 */
public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
