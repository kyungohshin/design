package chainOfResponsiblity;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 31. initial creation
 */
public class Handler {
	private Handler successor;

	public Handler() {}

	public Handler(Handler successor) {
		this.successor = successor;
	}

	public void handleRequest() {
		if (successor != null) {
			successor.handleRequest();
		}
	}

	public boolean canHandleRequest() {
		return false;
	}
}
