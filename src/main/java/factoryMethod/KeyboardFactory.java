package factoryMethod;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 17. initial creation
 */
public class KeyboardFactory {
	public Keyboard createKeyboard(String type) {
		Keyboard keyboard = null;
		switch (type) {
		case "LG":
			keyboard = new LGKeyboard();
			break;

		case "Samsung":
			keyboard = new SamsungKeyboard();
			break;
		}

		return keyboard;
	}
}
