package command;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 6. 21. initial creation
 */

class Command1 implements Runnable {
	@Override
	public void run() {
		System.out.println("RUN!");
	}
}

public class Main {
	public static void main(String[] args) {
		Thread t = new Thread(new Command1());
		t.start();
	}
}
