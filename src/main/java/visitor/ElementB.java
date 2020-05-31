package visitor;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 31. initial creation
 */
public class ElementB implements Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitElementB(this);
	}

	public String operationB() {
		return "Hello World from ElementB.";
	}

}
