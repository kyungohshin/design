package protoType;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 5. 25. initial creation
 */
public interface Product extends Cloneable {
	public abstract void use();

	public abstract Product createClone();
}
