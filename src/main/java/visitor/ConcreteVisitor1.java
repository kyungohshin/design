package visitor;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 31. initial creation
 */
public class ConcreteVisitor1 implements Visitor {

	@Override
	public void visitElementA(ElementA element) {
		System.out.println("ConcreteVisitor1: Visiting (doing something on) ElementA." + element.operationA());
	}

	@Override
	public void visitElementB(ElementB element) {
		System.out.println("ConcreteVisitor1: Visiting (doing something on) ElementB." + element.operationB());
	}

}
