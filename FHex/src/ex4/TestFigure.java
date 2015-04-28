package ex4;

class TestFigure {

	public static void main(String[] args) {
		
		Figure[] figures = new Figure[5];
		figures[0]=new Circle();
		figures[1]=new Rectangle();
		figures[2]=new Cylinder();
		figures[3]=new Cuboid();
		figures[4]=new Sphere();
		for (int i=0; i<figures.length; i++){
		System.out.println(figures[i].toString());
	}
		
		TwoDimensional[] shapes= new TwoDimensional[4];
		shapes[0]=new Circle(2.0);
		shapes[1]=new Rectangle(1.0,3.0);
		shapes[2]=new Circle();
		shapes[3]=new Rectangle(4.0,2.0);
		
		
		for(int i = 0;i<shapes.length;i++){
		if(shapes[i] instanceof Circle)
			System.out.println(((Circle)shapes[i]).toString());
		if(shapes[i] instanceof Rectangle)
			System.out.println((shapes[i]).toString());
		}
	}
}