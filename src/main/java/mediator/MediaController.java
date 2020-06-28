package mediator;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 6. 28. initial creation
 */
public class MediaController implements Colleague {
	private Mediator mediator;

	@Override
	public void receiveEvent(String name) {
		System.out.println(name + "컨트롤러실행");

	}

	@Override
	public void eventOccured(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

}
