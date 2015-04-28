package ex31;
class Person {
		 int age; 
		 String name; 
		 public Person(int n, String s) { 
		 age=n; 
		 name = new String(s); 
		 } 
		 void hasBirthday() { 
		 System.out.println("Happy Birthday, " + name +"!"); 
 		 age++; 
		 } 
}
