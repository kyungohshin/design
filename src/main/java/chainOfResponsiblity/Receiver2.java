package chainOfResponsiblity;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 31. initial creation
 */
public class Receiver2 extends Handler {
	public Receiver2(Handler successor) {
		super(successor);
	}

//	@Override
//	public boolean canHandleRequest() {
//		return true;
//	}

	@Override
	public void handleRequest() {
		if (canHandleRequest()) {
			System.out.println("Receiver2: Handling the request ...");
		} else {
			System.out.println("Receiver2: Passing the request along the chain ...");
			super.handleRequest();
		}
	}
}
