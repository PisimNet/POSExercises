package ex32;

class B extends A {
	 int b1=4; 
	 int b2=5; 
	 int b3=6; 
	 B(){ 
	 System.out.println("Constructor B(): "); 
	 System.out.println("a1= " + a1 + " a2="+a2+" a3="+a3); 
	 System.out.println("b1= " + b1 + " b2="+b2+" b3="+b3); 
	 b1=b2=b3=1; 
	 System.out.println("b1= " + b1 + " b2="+b2+" b3="+b3); 
	 } 
	 B(int x, int y, int z) { 
	 super(x); 
	 b1=y; 
	 b2=z; 
	 System.out.println("Constructor B(int x): "); 
	 System.out.println("a1= " + a1 + " a2="+a2+" a3="+a3); 
	 System.out.println("b1= " + b1 + " b2="+b2+" b3="+b3); 
	 }
}
