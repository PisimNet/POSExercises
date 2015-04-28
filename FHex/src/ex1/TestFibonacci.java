package ex1;
import java.util.*;

public class TestFibonacci {

	static int fibonacciNumber;
	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
		fibonacciNumber=Fibonacci.calculateFibonacci(n);
		System.out.println("Fibonacci Number = "+fibonacciNumber);
	}

}
