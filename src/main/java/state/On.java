package state;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 10. initial creation
 */
public class On implements PowerState {

	@Override
	public void powerPush() {
		System.out.println("절전 모드");
	}

}
