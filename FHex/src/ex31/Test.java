package ex31;

public class Test {

	public static void main(String[] args) { 
			 Person p1=new Person(32,"Peter Maier"); 
			 System.out.println(p1.name + " is now " + p1.age +" years old."); 
			 p1.hasBirthday(); 
			 System.out.println(p1.name + " is now " + p1.age +" years old."); 
			 Employee m1=new Employee(22,"Hugo Petersen",2500); 
			 System.out.println(m1.name + " is now " + m1.age +" years old" +" and earns "+ m1.salary +" Euro"); 
			 Client k1=new Client(8,"Martin Müller","green"); 
			 Client k2=new Client(9,"Max Müller","blue"); 
			 k1.givePresent(); 
			 k2.givePresent(); 
			 System.out.println(k2.name + " is now " + k2.age + " years old."); 
			 k2.hasBirthday(); 
			 System.out.println(k2.name + " is now " + k2.age +" years old."); 
			 k2.givePresent(); 
			 } 
} 
