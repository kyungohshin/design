package chainOfResponsiblity;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 31. initial creation
 */
public class Sender {
	public static void main(String[] args) {
		Handler handler = new Receiver1(new Receiver2(new Receiver3()));
		handler.handleRequest();
	}
}
