package ex22;

class PlaneRectangle extends Rectangle {
	Point p;
	
	public PlaneRectangle(double length, double width) {
		super(length,width);
	}
	public boolean IsInside(Point p){
		this.p=p;
		if (p.x <0 || p.x > length||p.y < 0 || p.y > width)
		return false;
		else return true;
	}
}
