package flyweight;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 25. initial creation
 */
public interface Iexe {
	public void exe();
}

class Java implements Iexe {

	public Java() {
		System.out.println("Java created");
	}

	@Override
	public void exe() {
		System.out.println("execute");
	}
}

class Python implements Iexe {

	public Python() {
		System.out.println("Python created");
	}

	@Override
	public void exe() {
		System.out.println("execute");
	}
}
