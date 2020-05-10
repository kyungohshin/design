package strategy;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 10. initial creation
 */
public class TeakwonV extends Robot {

	/**
	 * @param name
	 */
	public TeakwonV(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		System.out.println("missile.");
	}

	@Override
	public void move() {
		System.out.println("walk.");
	}
}
