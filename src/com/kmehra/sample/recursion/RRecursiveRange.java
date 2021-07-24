package com.kmehra.sample.recursion;

// WAF recursiveRange  which accepts a number and adds up all the numbers 
// from 0 to the number passed to the function recursively

public class RRecursiveRange {

	public static int recursiveRange(int range) {
		
		if(range == 0) {
			
			return 0;
		}
		
		return range + recursiveRange(--range);
	}
	
	public static void main(String args[]) {
	
		int value = 10;//6;
		int output = recursiveRange(value);
		
		System.out.println("The total of range " + value + " is " + output);
	}
	
}
