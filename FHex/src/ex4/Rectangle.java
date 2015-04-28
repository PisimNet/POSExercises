package ex4;

class Rectangle extends TwoDimensional {
	double Length = 4.0;
	double Width = 3.0;
	
	public Rectangle() {
	}
	
	public Rectangle(double Length, double Width){
		this.Length = Length; 
		this.Width = Width;
		}
	
	public double area(){
		return Length*Width;}
	
	@Override
	public double getCircumference() {
		return 2*(Length+Width);
	}
	
	@Override
	public double getArea() {
		return Width*Length;
	}
	
	@Override
	public String toString() {
		double circ = this.getCircumference();
		double area = this.getArea();
		return "Rectangle with Length :"+ Length+" and Width :"+Width +"Circumference :" + circ +" Area :" +area;
	}
}
