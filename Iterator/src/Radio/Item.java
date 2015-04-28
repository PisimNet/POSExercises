package Radio;

class Item {
	String name;
	boolean romantic;
	int year;
	String length;

	public Item(String name, boolean romantic, int year, String length) {
		this.name=name;
		this.romantic=romantic;
		this.year=year;
		this.length=length;
	}
	
	public String getName() {
		return name;
	}
	public boolean isRomantic() {
		return romantic;
	}
	public int getYear() {
		return year;
	}
	public String getLength() {
		return length;
	}
}
