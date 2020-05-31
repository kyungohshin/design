package abstractFactory;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 17. initial creation
 */
public class FactoryOfComputerFactory {
	public void createComputer(String type) {
		ComputerFactory computerFactory = null;
		switch (type) {
		case "LG":
			computerFactory = new LGComputerFactory();
			break;

		case "Samsung":
			computerFactory = new SamsungComputerFactory();
			break;
		}

		Keyboard keyboard = computerFactory.createKeyboard();
		Mouse mouse = computerFactory.createMouse();
		keyboard.getKeyboard();
		mouse.getMouse();

		System.out.println("--- " + type + " 컴퓨터 완성 ---");
	}
}
