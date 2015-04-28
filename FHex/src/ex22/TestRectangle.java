package ex22;

import java.util.Scanner;

public class TestRectangle {

	public static void main(String[] args) {
	    
		System.out.println("Pease choose 0 or 1:");
		System.out.println("0) terminate the program \n"
				+ "1) input of a new rectangle \n"
				+ "2) determine the circumference of the current rectangle \n"
				+ "3) determine the area of the current rectangle \n"
				+ "4) put in a point and check if it is inside the current rectangle. \n");
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    switch(n){
	    case 0: System.out.println("terminated");
	    sc.close();
	    break;
	    
	    case 1: System.out.println("input new length & width:");
	    System.out.println("input new x & y of the pint:");
	    double length =sc.nextDouble();
	    double width =sc.nextDouble();
	    double x =sc.nextDouble();
	    double y =sc.nextDouble();
	    PlaneRectangle pr = new PlaneRectangle(length,width);
	    System.out.println("perim =\t"+pr.perim()+" area = "+pr.area());
	    Point p = new Point(x,y);
		System.out.println(""+pr.IsInside(p));
		sc.close();
	    break;
	  
	    }
		
		
		//ex 2 task 2
	/*  Rectangle r = new Rectangle();
		Rectangle r1 = new Rectangle(3,4);
		Rectangle r2 = new Rectangle(1,3);
		if (Rectangle.areaIsBbigger(r1, r2)&&Rectangle.circumferenceIsBbigger(r1, r2)){
			  System.out.println("true");
		}else{System.out.println("false");}
		System.out.println("area="+r.area()+" perim="+r.perim()+" diagonal="+r.diag());
		*/
	}
}
