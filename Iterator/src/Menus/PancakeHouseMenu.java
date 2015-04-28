package Menus;
import java.util.ArrayList;

public class PancakeHouseMenu {
	ArrayList<MenuItem> menuItems;

	public PancakeHouseMenu(){
		menuItems = new ArrayList<MenuItem>();
		
		addItem("K&B's Pancake Breakfast",
				"Pancakes with scrambles eggs, and toast",
				true,
				2.99);
		
		addItem("Regular Pancake Breakfast",
				"Pancakes with fried eggs, and sausage",
				false,
				2.99);
		
		addItem("Blueberry Pancakes",
				"Pancakes made with fresh blueberries",
				true,
				3.49);
		
		addItem("Waffles",
				"Waffles with your choice..",
				true,
				3.59);
	}
	public void addItem(String name,
			String description,
			boolean vegetarian, 
			double price) {
		MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
		menuItems.add(menuItem);
	}
	/* public ArrayList<MenuItem> getMenuItems(){
		return menuItems;
	} */
	public Iterator creatIterator() {
		return new PancakeHouseMenuIterator(menuItems);
	}
}
