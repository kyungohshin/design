package composite;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 6. 21. initial creation
 */
public class PowerController {

	public void turnOn(String deviceId) {
		Device device = findDeviceById(deviceId);
		device.turnOn();
	}

	public void turnGroupOn(String groupId) {
		DeviceGroup group = findGroupById(groupId);
		group.trunAllOn();
	}

	private DeviceGroup findGroupById(String groupId) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 *
	 *
	 * @param deviceId
	 * @return
	 */
	private Device findDeviceById(String deviceId) {
		// TODO Auto-generated method stub
		return null;
	}
}
