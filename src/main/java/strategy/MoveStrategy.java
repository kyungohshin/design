package strategy;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 10. initial creation
 */
public interface MoveStrategy {
	public void move();
}

class flyStrategy implements MoveStrategy {

	@Override
	public void move() {
		System.out.println("fly");
	}

}

class walkStrategy implements MoveStrategy {

	@Override
	public void move() {
		System.out.println("walk");
	}

}
