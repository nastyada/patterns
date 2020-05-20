package iterator.bookTask;

import java.util.*;


public class Waitress {
	ArrayList<Menu> menus;

	public Waitress(ArrayList<Menu> menus) {
		this.menus = menus;
	}

	public void printMenu() {
		Iterator<?> menuIterator = menus.iterator();
		while (menuIterator.hasNext()) {
			Menu menu = (Menu) menuIterator.next();
			System.out.println(String.format("================= %s =================\n", menu.getMenuName()));
			printMenu(menu.createIterator());
		}
	}

	void printMenu(Iterator<?> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.print(String.format("--- %s ---\n", menuItem.getName()));
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription() + "\n");
		}
	}
}  