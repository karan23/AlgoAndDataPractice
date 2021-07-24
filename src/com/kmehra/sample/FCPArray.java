package com.kmehra.sample;

import java.util.HashMap;
// Frequency Counter Pattern (FCP)
// Function same which accepts two arrays. The function should return true if every value in one array 
// has same frequency. 
public class FCPArray {

	
	public static Boolean same(Integer[] array1, Integer[] array2) {
		
		boolean isSame = true;
		HashMap<Integer, Integer> counterMap1 = new HashMap<>();
		HashMap<Integer, Integer> counterMap2 = new HashMap<>();
		
		
		if(array1.length != array2.length) {
			
			return false;
		}
		
		for(int i = 0; i < array1.length; i++) {
			
			//boolean isValue = counterMap1.containsKey(array1[i]);
			int value = counterMap1.containsKey(array1[i]) ? counterMap1.get(array1[i]) : 0; 
			counterMap1.put(array1[i], ++value);
		}
		
		for(int j = 0; j < array2.length; j++) {
			
			int value = counterMap2.containsKey(array2[j]) ? counterMap2.get(array2[j]) : 0; 
			counterMap2.put(array2[j], ++value);
		}
		
		
		for(int key : counterMap1.keySet()) {
			
			int sqrValue = (int) Math.pow(key, 2);
			if(!counterMap2.containsKey(sqrValue) 
					|| counterMap2.get(sqrValue) != counterMap1.get(key)) {
				
				return false;
			} 
				
		}
		
		return isSame;
	}
	
	public static void main(String args[]) {
		
		Integer[] array1 = {1,5,2,7,2,3,4};
		Integer[] array2 = {25,4,16,49,4,1,9};
		
		boolean isSame = same(array1, array2);
		
		System.out.println("The Two arrays are same : " + isSame);
		
		
	}
}
