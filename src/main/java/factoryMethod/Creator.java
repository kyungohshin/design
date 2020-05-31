package factoryMethod;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 31. initial creation
 */
public interface Creator {
	public Computer factoryMethod();

	public default String anOperation() {
		Computer computer = this.factoryMethod();
		System.out.println(computer.name());
		return computer.name();
	}
}
