package com.kmehra.sample.recursion;

public class RPalindrome {

	public static boolean isPalindrome(String string) {
		
		
		char[] charArray = string.toCharArray();
		int len = charArray.length;
		
		if(charArray[0] != charArray[len - 1]) {
			
			return false;
		}
		
		if(len == 1 || len ==2) {
			return true;
		}
		
		return isPalindrome(string.substring(1, len -1));
		
	}
	
	public static void main(String args[]) {
		
		String value = "amanaplanacanalpandemonium";//"amanaplanacanalpanama";//"tacocat";//"foobar";//"awesome";
		
		boolean isPalindrome = isPalindrome(value);
		
		System.out.println("The " + value + " is palindrome : " + isPalindrome);
		
	}
	
}
