package ex1;

import java.util.ArrayList;

public class Fibonacci {

	public static int calculateFibonacci(int n){
		ArrayList<Integer> mass = new ArrayList<Integer>();
		
		for (int i=0;i<=n;i++){
			if(i<=1){
				mass.add(i,1);
			}else{
				mass.add(i,mass.get(i-1)+mass.get(i-2));
			}
		}
		return mass.get(n);
	}
}
