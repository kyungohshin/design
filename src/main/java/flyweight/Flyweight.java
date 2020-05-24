package flyweight;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 25. initial creation
 */
public class Flyweight {

	public static void main(String args[]) {
		Factory f = new Factory();
		Java j1 = f.getInstance("JAVA");
		Java j2 = f.getInstance("JAVA");
	}

}
