package state;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 10. initial creation
 */
public class Off implements PowerState {

	@Override
	public void powerPush() {
		System.out.println("전원 on");
	}

}
