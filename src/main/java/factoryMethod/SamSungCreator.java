package factoryMethod;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 31. initial creation
 */
public class SamSungCreator implements Creator {

	@Override
	public Computer factoryMethod() {
		return new SamSungComputer();
	}

}
