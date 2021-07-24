package com.kmehra.sample.recursion;

public class RPower {
	
	public static int power(int base, int exponent) {
		
		if(exponent == 0) {
			
			return 1;
		}
		
		return base * power(base, --exponent);
		
	}
	
	public static void main(String args[]) {
		
		int base = 5;//2;
		int exponent = 4;// 2;// 0;
		
		int value = power(base, exponent);
		
		System.out.println("The base with " + base + " to power " 
		+ exponent + " is " + value);
	}

}
