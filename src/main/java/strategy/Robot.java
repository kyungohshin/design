package strategy;

/**
 *
 *
 * @author kyungoh.shin
 * @history
 *          2020. 5. 10. initial creation
 */
public abstract class Robot {
	private String name;

	public Robot(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract void attack();

	public abstract void move();
}

//public abstract class Robot {
//	private String name;
//	private AttackStrategy attackStrategy;
//	private MoveStrategy moveStrategy;
//
//	public Robot(String name) {
//		this.name = name;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void attack() {
//		attackStrategy.attack();
//	};
//
//	public void move() {
//		moveStrategy.move();
//	};
//
//	public void setAttackStrategy(AttackStrategy attackStrategy) {
//		this.attackStrategy = attackStrategy;
//	}
//
//	public void setMoveStrategy(MoveStrategy moveStrategy) {
//		this.moveStrategy = moveStrategy;
//	}
//}
