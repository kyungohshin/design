package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 31. initial creation
 */
public class Client {
	public static void main(String[] args) {
		List<Element> elements = new ArrayList<Element>();
		elements.add(new ElementA());
		elements.add(new ElementB());

		Visitor visitor = new ConcreteVisitor1();
		for (Element element : elements) {
			element.accept(visitor);
		}
	}
}
