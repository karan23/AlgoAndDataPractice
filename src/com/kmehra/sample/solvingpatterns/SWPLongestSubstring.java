package com.kmehra.sample.solvingpatterns;

import java.util.HashMap;
import java.util.HashSet;

// SWP
// Write a function called findLongestSubstring, which accepts 
// a string and returns the length of the longest substring with
// all distinct characters. 
public class SWPLongestSubstring {

	public static int findLongestSubstring(String str) {
		
		int maxSize = 0;
		int start = 0;
		int end = 0;
		HashSet<Character> charSet = new HashSet<Character>();
		
		char[] charray = str.toCharArray();
		
		while(start < charray.length) {
		
			if(end < charray.length
					&& !charSet.contains(charray[end])) {
				
				
				charSet.add(charray[end]);
				maxSize = Math.max(maxSize, charSet.size());
				end++;
			} else {
				
				charSet.remove(charray[start]);
				start++;
				
			} 
			
		}
		
		return maxSize;
		
	}
	
	public static void main(String[] args) {
		
		String str = "ritmschool";//"";//"bbbbbbbbb"; //"thecatinthehat"; //"thisisawesome";
		int longestSize = findLongestSubstring(str);
		System.out.println("The longest subarray size is : " + longestSize);
	}

}
