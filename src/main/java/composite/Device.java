package composite;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 6. 21. initial creation
 */
public abstract class Device {

	public void addDevice(Device d) {
		throw new UnsupportedOperationException();
	}

	public void removeDevice(Device d) {
		// 아무것도 하지않음
	}

	public abstract void turnOn();

	public abstract void turnOff();

}
