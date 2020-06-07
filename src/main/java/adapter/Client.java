package adapter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 6. 7. initial creation
 */
public class Client {
	public static void main(String[] args) {

		Vector<Object> v = new Vector<>();

		v.addElement(new String("첫번째"));
		v.addElement(new String("두번째"));
		v.addElement(new String("세번째"));

		Enumeration<Object> enu = v.elements();
//		while (enu.hasMoreElements()) {
//			String temp = "" + enu.nextElement();
//			System.out.println(temp);
//		}

		Iterator iteratorAdapter = new EnumerationIterator(enu);
		while (iteratorAdapter.hasNext()) {
			String temp = "" + enu.nextElement();
			System.out.println(temp);
		}
	}

}
