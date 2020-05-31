package visitor;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 31. initial creation
 */
public interface Element {
	public void accept(Visitor visitor);
}
