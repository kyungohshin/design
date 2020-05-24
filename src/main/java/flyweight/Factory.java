package flyweight;

import java.util.HashMap;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 25. initial creation
 */
public final class Factory {

	private HashMap<String, Java> map = new HashMap<String, Java>();

	public Java getInstance(String t) {
		Java instance = map.get(t);
		if (instance == null && t == "JAVA") {
			instance = new Java();
			map.put(t, instance);
		}
		return instance;
	}
}
