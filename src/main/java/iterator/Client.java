package iterator;

import java.util.ArrayList;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 6. 21. initial creation
 */
public class Client {

//	public static void main(String args[]) {
//		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
//		ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
//
//		DinerMenu dinerMenu = new DinerMenu();
//		MenuItem[] lunchItems = dinerMenu.getMenuItems();
//
//		// arrayList
//		for (int i = 0; i < breakfastItems.size(); i++) {
//			MenuItem menuItem = breakfastItems.get(i);
//			System.out.println(menuItem.getName());
//			System.out.println(menuItem.getPrice());
//			System.out.println(menuItem.getDescription());
//		}
//
//		// 배열
//		for (int i = 0; i < lunchItems.length; i++) {
//			MenuItem menuItem = lunchItems[i];
//			System.out.println(menuItem.getName());
//			System.out.println(menuItem.getPrice());
//			System.out.println(menuItem.getDescription());
//		}
//
//	}

	public static void main(String args[]) {
		ArrayList<Menu> menuList = new ArrayList<>();
		menuList.add(new PancakeHouseMenu());
		menuList.add(new DinerMenu());
		Waitress waitress = new Waitress(menuList);
		waitress.printMenu();
	}

}
