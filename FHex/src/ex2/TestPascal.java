package ex2;

import java.util.Scanner;

class TestPascal {
	
	public static void main(String[] args) {
		
	    System.out.println("How many lines do you want for Pascal's triangle? ");
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    Pascal.calc(n);
		}
}
