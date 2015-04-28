package ex22;

class Rectangle {
	double length; 
	double width;
	double a;
	
	public Rectangle(){
		this(3);
		width=length=1;
		a=width*length;
		System.out.println("width=length="+length+", square="+a);
	}
	public Rectangle(double width){
		this(2,3);
		this.width=width;
		this.length=4;
		a=width*length;
		System.out.println("width="+width+", length="+length+", square="+a);
	}
	public Rectangle(double length,double width){
		this.width=width;
		this.length=length;
		a=width*length;
		System.out.println(" length="+length+", width="+width+", square="+a);
}
	public double area(){
		return length*width;
	}
	public double perim() {
		return 2*(length+width);
	}
	public double diag() {
		return Math.sqrt(width*width+length*length);
	}
	public static boolean areaIsBbigger(Rectangle r1,Rectangle r2){
		return r1.area()>r2.area();
		}
	public static boolean circumferenceIsBbigger(Rectangle r1,Rectangle r2){
		return r1.perim()>r2.perim();
	}
	}