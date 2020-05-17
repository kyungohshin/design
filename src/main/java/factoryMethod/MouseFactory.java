package factoryMethod;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 17. initial creation
 */
public class MouseFactory {
	public Mouse createMouse(String type) {
		Mouse mouse = null;
		switch (type) {
		case "LG":
			mouse = new LGMouse();
			break;

		case "Samsung":
			mouse = new SamsungMouse();
			break;
		}

		return mouse;
	}
}
