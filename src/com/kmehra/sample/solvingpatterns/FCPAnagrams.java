package com.kmehra.sample.solvingpatterns;

import java.util.HashMap;
import java.util.Set;
// Frequency Counter Pattern (FCP)
// Function validAnagram which accepts two String and. The function should return true if every value 
// in one string has same frequency 
public class FCPAnagrams {

	
	public static boolean validAnagrams(String str1, String str2) {
		
		boolean isValid = true;
		HashMap<Character, Integer> counterMap = new HashMap<>();
		
		String st1 = str1.toLowerCase().replace("\\s", "");
		String st2 = str2.toLowerCase().replace("\\s", "");
		
		if(st1.length() != st2.length()) {
			
			return false;
		}
		
		char[] st1Chars = st1.toCharArray();
		char[] st2Chars = st2.toCharArray();
		
		for(int i=0; i<st1Chars.length; i++) {
			
			char key = st1Chars[i];
			int value = counterMap.containsKey(key) ? counterMap.get(key) : 0;
			counterMap.put(key, value+1);
		}
		
		Set<Character> keySet = counterMap.keySet();
		
		for(int j = 0; j<st2Chars.length; j++) {
			char key = st2Chars[j];
			int value = counterMap.containsKey(key) ? counterMap.get(key) : 0;
			
			if(value == 0) {
				
				return false;
			} else {
				
				counterMap.put(key, value-1);
			}
		}
		
		return isValid;
	}
	
	public static void main(String args[]) {
		
		String str1 = "ababaa";//"anagram";
		String str2 = "aaabab";//"nagaram";
		
		boolean isSame = validAnagrams(str1, str2);
		
		System.out.println("The Two arrays are same : " + isSame);
		
		
	}
}
