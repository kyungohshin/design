package state;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 10. initial creation
 */
public class Client {
	public static void main(String args[]) {
		Laptop laptop = new Laptop();
//		On on = new On();
//		Off off = new Off();
//		Save save = new Save();

		laptop.powerPush();
		System.out.println("===============");
		// laptop.setPowerState(Laptop.ON);
		laptop.powerPush();
//		laptop.setPowerState(save);
//		laptop.powerPush();
//		laptop.setPowerState(off);
//		laptop.powerPush();
	}
}
