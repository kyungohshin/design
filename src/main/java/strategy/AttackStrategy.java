package strategy;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 10. initial creation
 */
public interface AttackStrategy {
	public void attack();
}

class MissleStrategy implements AttackStrategy {

	@Override
	public void attack() {
		System.out.println("missle");
	}

}

class punchStrategy implements AttackStrategy {

	@Override
	public void attack() {
		System.out.println("punch");
	}

}
