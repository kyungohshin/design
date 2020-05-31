package abstractFactory;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 17. initial creation
 */
public class SamsungComputerFactory extends ComputerFactory {
	public SamsungKeyboard createKeyboard() {
		return new SamsungKeyboard();
	}

	public SamsungMouse createMouse() {
		return new SamsungMouse();
	}
}
