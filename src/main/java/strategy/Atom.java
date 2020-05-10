package strategy;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 10. initial creation
 */
public class Atom extends Robot {

	/**
	 * @param name
	 */
	public Atom(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("punch.");
	}

	@Override
	public void move() {
		System.out.println("fly.");
	}
}
