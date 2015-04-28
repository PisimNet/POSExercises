package Menus;

public class Waitress {
	DinerMenu dinerMenu;
	PancakeHouseMenu pancakeMenu;
	
	public Waitress(DinerMenu dinerMenu, PancakeHouseMenu pancakeMenu){
		this.dinerMenu=dinerMenu;
		this.pancakeMenu = pancakeMenu;
	}
	
	public void printMenu(){
		Iterator dinerIterator = dinerMenu.creatIterator();
		Iterator pancakeIterator = pancakeMenu.creatIterator();
		System.out.println("Menu\n----\nLunch");
		printMenu(dinerIterator);
		System.out.println("Menu\n----\nBreakfast");
		printMenu(pancakeIterator);
	}

	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()){
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.println(menuItem.getName()+", ");
			System.out.println(menuItem.getPrice()+" -- ");
			System.out.println(menuItem.getDescription());
		}
	}

}
