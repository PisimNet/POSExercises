package Menus;

public class MenuTestDrive {

	public static void main(String[] args) {
		DinerMenu dinerMenu = new DinerMenu();
		PancakeHouseMenu pancakeMenu = new PancakeHouseMenu();
		
		Waitress waitress = new Waitress(dinerMenu,pancakeMenu);
		waitress.printMenu();
	}

}
