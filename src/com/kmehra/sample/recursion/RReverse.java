package com.kmehra.sample.recursion;

public class RReverse {

	public static String reverse(String str) {
		
		char[] charArray = str.toCharArray();
		int len = charArray.length;
		
		if(len == 1) {
			return str;
		}
		
		return Character.toString(charArray[len - 1]) + reverse(str.substring(0, len-1));  
				
	}
	
	public static void main(String args[]) {
		
		String value = "rithmschool";//"awesome";
		String output = reverse(value);
		
		System.out.println("The reverse of " + value + " is " + output);
	}
}
