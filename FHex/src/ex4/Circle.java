package ex4;

class Circle extends TwoDimensional {
	double r = 3.0;
	static final double PI = 3.14;
	
	public Circle() {
	}
	
	public Circle(double r) {
		this.r=r;
	}

	@Override
	public double getCircumference() {
		return 2*PI*r;
	}
	
	@Override
	public double getArea() {
		return PI*r*r;
	}
	
	@Override
	public String toString() {
		double circ = this.getCircumference();
		double area = this.getArea();
		return "Circle with Radius :"+ r +"Circumference :" + circ +" Area :" +area;
	}

	@Override
	public double area() {
		return PI*r*r;
	}
}
