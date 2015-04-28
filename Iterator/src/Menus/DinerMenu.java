package Menus;

public class DinerMenu {
	static final int MAX_ITEMS=6;
	int numberOfItems=0;
	MenuItem[] menuItems;
	
	public DinerMenu(){
		menuItems=new MenuItem[MAX_ITEMS];
		
		addItem("Vegetarian BLT",
				"(Fakin') Bacon with lettuce & tomato on whole wheat",
				true,
				2.99);
				
		addItem("BLT",
				"Bacon with lettuce & tomato on whole wheat",
				false,
				2.99);
				
		addItem("Soup of the day",
				"Soup of the day, with a side potato salad",
				false,
				3.29);
				
		addItem("Hotdog",
				"A hot dog, with saurkraut,relish,..",
				false,
				3.05);
		// 2 more items here
	}

	public void addItem(String name,
			String description, boolean vegetarian, 
			double price) {
		MenuItem menuItem = new MenuItem(name, 
				description, vegetarian, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Soory,menu is full!");
		}else{
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}
	/*public MenuItem[] getMenuItems(){
		return menuItems; 
	}*/
	//other menu methods here
	
	public Iterator creatIterator(){
		return new DinerMenuIterator(menuItems);
	}

}
