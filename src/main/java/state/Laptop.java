package state;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 10. initial creation
 *
 *          스테이트 패턴
 *          객체가 특정상태에 따라 행위를 달리하는 상황에서, 자신이 직접 상태를 체크하여 상태에따른 행위를 호출하는게 아니라,
 *          상태를 객체화 하여 상태가 행동할 수 있도록 위임하는 패턴.
 *
 *          객체의 특정 상태를 클래스로 선언하고, 클래스에서는 해당 상태에서 할수있는 행위들을 메소드로 정의
 *          이러한 각 상태 클래스들을 인터페이스로 캡슐화하여, 클라이언트에서 인터페이스를 호출하는 방식
 *
 *          참조 https://victorydntmd.tistory.com/294
 */
//public class Laptop {
//	public static String ON = "on";
//	public static String OFF = "off";
//	// public static String SAVE = "save";
//	private String powerState = "";
//
//	public Laptop() {
//		setPowerState(Laptop.OFF);
//	}
//
//	public void setPowerState(String powerState) {
//		this.powerState = powerState;
//	}
//
//	public void powerPush() {
//		if ("on".equals(this.powerState)) {
//			System.out.println("전원 off");
//			// } else if ("save".equals(this.powerState)) {
//
//		} else {
//			System.out.println("전원 on");
//		}
//	}
//}

public class Laptop {
	private PowerState powerState;

	public Laptop() {
		setPowerState(new Off());
	}

	public void setPowerState(PowerState powerState) {
		this.powerState = powerState;
	}

	public void powerPush() {
		powerState.powerPush(this);
	}
}
