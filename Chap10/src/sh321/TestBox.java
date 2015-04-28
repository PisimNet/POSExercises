package sh321;

import java.util.Date;

public class TestBox {
	int j;
Integer i = 0 ; //= new Integer(j);
String z = "true";
boolean b = new Boolean(z).booleanValue();
int one = 204566654;
double two = 100567890.2489;

	public static void main(String[] args) {
		TestBox t = new TestBox();
		t.go();
		System.out.printf("we should %,.2f",1000.087);
	}
	
	public void go(){
		j=i;
		System.out.println(j);
		System.out.println(i);
		System.out.println(b);
		String s = String.format("level %,d of %,.2f", one, two);
		System.out.println(s);
		String s1 = String.format("%tc", new Date());
		System.out.println(s1);
	}
}
