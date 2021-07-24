package com.kmehra.sample.recursion;

// Write a recursive function called fib which accepts a number and returns
// the nth number in the Fibonacci sequence. Recall that the Fibonacci sequence
// is the sequence of whole numbers 1, 1, 2, 3, 5, 8, ... which starts with 1 
// and 1, and where every number thereafter is equal to the sum of the previous
// two numbers.
public class RFibonacci {

	public static int fib(int n) {
		
		if(n == 1) {
			return 1;
		}
		
		if(n == 2) {
			
			return 1;
		}
		
		return fib(n-1) + fib(n-2);
	}
	
	public static void main(String[] args) {
		
		int value = 35;//28;//10;//4;
		int output = fib(value);
		
		System.out.println("The fibonacci for element at position " 
		+ value + " is " + output);
	}

}
