package visitor;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 31. initial creation
 */
public class ElementA implements Element {
	String t = "1";

	@Override
	public void accept(Visitor visitor) {
		visitor.visitElementA(this);
	}

	public String operationA() {
		return "Hello World from ElementA.";
	}

}
