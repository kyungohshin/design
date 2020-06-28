package mediator;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 6. 28. initial creation
 */
public class TitleUI implements Colleague {

	/*
	 * (non-Javadoc)
	 *
	 * @see mediator.Colleague#receiveEvent(java.lang.String)
	 */
	@Override
	public void receiveEvent(String name) {
		System.out.println(name + "자막띄움");

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see mediator.Colleague#eventOccured(int)
	 */
	@Override
	public void eventOccured(int id) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see mediator.Colleague#setMediator(mediator.Mediator)
	 */
	@Override
	public void setMediator(Mediator mediator) {
		// TODO Auto-generated method stub

	}

}
