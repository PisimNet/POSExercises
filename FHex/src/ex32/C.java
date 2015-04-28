package ex32;

class C extends B {
	 int c; 
	 C(int x) 
	 { 
	 super(x,x,x); 
	 System.out.println("Constructor C(int x): "); 
	 System.out.println("a1= " + a1 + " a2="+a2+" a3="+a3); 
	 System.out.println("b1= " + b1 + " b2="+b2+" b3="+b3); 
	 System.out.println("c= " + c); 
	 } 
	 C() { 
	 this(7); 
	 System.out.println("Constructor C(): "); 
	 System.out.println("a1= " + a1 + " a2="+a2+" a3="+a3); 
	 System.out.println("b1= " + b1 + " b2="+b2+" b3="+b3); 
	 System.out.println("c= " + c); 
	 }
}
