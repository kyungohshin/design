package command;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 6. 21. initial creation
 */
public class Stereo {

	public void off() {
		System.out.println("스테리오 off");
	}

	public void on() {
		System.out.println("스테리오 on");
	}

	public void setCD() {
		System.out.println("set CD");
	}

	public void setVolume(int vol) {
		System.out.println("volume" + vol);
	}
}
