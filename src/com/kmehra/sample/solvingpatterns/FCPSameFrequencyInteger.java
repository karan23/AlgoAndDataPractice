package com.kmehra.sample.solvingpatterns;

import java.util.HashMap;

// FCP. WAF sameFrequency. given two positive integers, find out if 
// two numbers have same frequency.
public class FCPSameFrequencyInteger {

	public static boolean sameFrequency(int num1, int num2) {
		
		HashMap<Integer, Integer> counterMap = new HashMap<Integer, Integer>(); 
		boolean isSameFrequency = true;
		
		int temp1 = num1;
		int temp2 = num2;
		
		while(temp1 != 0) {
			
			int val = temp1%10;
			temp1 = temp1/10;
			
			int value = counterMap.containsKey(val) ? counterMap.get(val) : 0;
			counterMap.put(val, value + 1);
		}
		
		while(temp2 != 0) {
			
			int val = temp2%10;
			temp2 = temp2/10;
			
			int value = counterMap.containsKey(val) ? counterMap.get(val) : 0;
			
			if(value == 0) {
				
				return false;
			} else {
				
				counterMap.put(val, value-1);
			}
		}
		
		return isSameFrequency;
	}
	
	public static void main(String args[]) {
		
		boolean isSame = sameFrequency(22,222);//(3589578, 5879385);//(34,14);//(182, 281);
		
		System.out.println("The wo numbers have same frequency :" + isSame);
		
	}
	
}
