package iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 6. 21. initial creation
 */
public class Waitress {

	ArrayList<Menu> menus;

	public Waitress(ArrayList<Menu> menus) {

		this.menus = menus;

	}

	public void printMenu() {
		Iterator<Menu> menuIterator = menus.iterator();
		while (menuIterator.hasNext()) {
			Menu menu = menuIterator.next();
			printMenu(menu.createIterator());
		}
	}

	private void printMenu(Iterator<MenuItem> iterator) {

		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			System.out.println(menuItem.getName());
			System.out.println(menuItem.getPrice());
			System.out.println(menuItem.getDescription());
		}
	}

}
