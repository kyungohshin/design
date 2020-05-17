package factoryMethod;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 17. initial creation
 */
public interface Keyboard {
	public void getKeyboard();
}

class LGKeyboard implements Keyboard {
	@Override
	public void getKeyboard() {
		System.out.println("LG 키보드 생성");
	}
}

class SamsungKeyboard implements Keyboard {
	@Override
	public void getKeyboard() {
		System.out.println("SamSung 키보드 생성");
	}
}
