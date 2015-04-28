package ex32;

class A {
	 int a1=1; 
	 int a2=2; 
	 int a3=3; 
	 A(){ 
	 a3 = 5; 
	 System.out.println("Constructor A(): "); 
	 System.out.println("a1= " + a1 + " a2="+a2+" a3="+a3); 
	 } 
	 A(int x) { 
	 this(); 
	 a2=x; 
	 System.out.println("Constructor A(int x): "); 
	 System.out.println("a1= " + a1 + " a2="+a2+" a3="+a3); 
	 }
}
