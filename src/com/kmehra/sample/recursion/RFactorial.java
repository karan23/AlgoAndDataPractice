package com.kmehra.sample.recursion;

public class RFactorial {

	
	public static int factorial(int value) {
		
		if(value == 0 
			|| value == 1) {
			
			return 1;
		}
		
		return value * factorial(--value);
	}
	
	public static void main(String args[]) {
		
		int value = 6;
		
		int output = factorial(value);
		
		System.out.println("The factorial of " + value + " is " + output);
	}
}
