package observer;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 6. 28. initial creation
 */
public interface Subject {
	public void registerObserver(Observer o);

	public void removeObserver(Observer o);

	public void notifyObservers();
}
