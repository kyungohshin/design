package composite;

/**
 *
 *
 * @author USER
 * @history
 *          2020. 6. 21. initial creation
 */
public class Client {
	public static void main(String args[]) {

		MenuComponent moringMenu = new Menu("펜케이크 하우스 메뉴", "아침 메뉴");
		MenuComponent LunchMenu = new Menu("객체마을 식당 메뉴", "점심 메뉴");
		MenuComponent dinnerMenu = new Menu("카페 메뉴", "저녁 메뉴");
		MenuComponent dessertMenu = new Menu("디저트 메뉴", "디저트를 즐겨 보세요");
		MenuComponent allMenus = new Menu("전체 메뉴", "전체 메뉴");

		allMenus.add(moringMenu);
		allMenus.add(LunchMenu);
		LunchMenu.add(new MenuItem("파스타", "마리나라 소스 스파게티.", true, 3.89));
		allMenus.add(dinnerMenu);

		LunchMenu.add(dessertMenu);

		dessertMenu.add(new MenuItem("애플 파이", "바삭바삭한 크러스트에 바닐라아이스크림이", true, 1.59));

		allMenus.print();

	}

}
