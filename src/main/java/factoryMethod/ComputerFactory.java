package factoryMethod;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 17. initial creation
 */
public class ComputerFactory {
	public void createComputer(String type) {
		KeyboardFactory keyboardFactory = new KeyboardFactory();
		MouseFactory mouseFactory = new MouseFactory();

		Keyboard keyboard = keyboardFactory.createKeyboard(type);
		keyboard.getKeyboard();
		Mouse mouse = mouseFactory.createMouse(type);
		mouse.getMouse();
		// Speaker speaker = ...
		// Monitor monitor = ...
		System.out.println("--- " + type + " 컴퓨터 완성 ---");
	}
}
