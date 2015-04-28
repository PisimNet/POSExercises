package ex31;

public class Employee extends Person {
	int salary; 
	 public Employee(int n,String s, int g) { 
	 super(n,s); 
	 salary=g; 
	 } 
	 void increaseSalary(int increase) { 
	 salary+=increase; 
	 } 
}
