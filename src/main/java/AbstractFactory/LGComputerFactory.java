package AbstractFactory;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 17. initial creation
 */
public class LGComputerFactory extends ComputerFactory {
	@Override
	public LGKeyboard createKeyboard() {
		return new LGKeyboard();
	}

	@Override
	public LGMouse createMouse() {
		return new LGMouse();
	}
}
