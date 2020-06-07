package adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 6. 7. initial creation
 */
public class EnumerationIterator implements Iterator<Object> {
	Enumeration<Object> enumeration;

	public EnumerationIterator(Enumeration<Object> enumeration) {
		this.enumeration = enumeration;
	}

	@Override
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}

	@Override
	public Object next() {
		return enumeration.nextElement();
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
