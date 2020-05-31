package abstractFactory;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 17. initial creation
 */
public interface Mouse {
	public void getMouse();
}

class LGMouse implements Mouse {
	@Override
	public void getMouse() {
		System.out.println("LG 마우스 생성");
	}
}

class SamsungMouse implements Mouse {
	@Override
	public void getMouse() {
		System.out.println("Samsung 마우스 생성");
	}
}
