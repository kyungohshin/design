package mediator;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 6. 28. initial creation
 */
public interface Colleague {
	public void receiveEvent(String name);

	public void eventOccured(int id);

	public void setMediator(Mediator mediator);
}
