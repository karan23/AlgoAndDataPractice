package com.kmehra.sample.solvingpatterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

// check whether a array has duplicate values or not
public class FCPNMPPDuplicates {


	public static boolean areThereDuplicates(int[] vals) {
		boolean isDuplicates = false;
		HashMap<Integer, Integer> unqiueMaps = new HashMap<Integer, Integer>(); 
		for(int i =0; i< vals.length; i++) {
			
			int value = unqiueMaps.containsKey(vals[i]) ? 1 : -1;
			
			if(value == 1) {
				return true;
			}
			
			unqiueMaps.put(vals[i], 1);
		}
		
		return isDuplicates;
		
	}
	
	public static boolean areThereDuplicatesMpp(List<Integer> intList) {
		
		boolean isDuplicates = false;
		Collections.sort(intList);
		
		for(int i = 0; i< intList.size()-1; i++) {
			
			int next = i+1;
			if(intList.get(i) == intList.get(next)) {
				return true;
			}
		}
		
		return isDuplicates;
	}
	
	public static boolean areThereDuplicatesHashSet(List<Integer> intList) {
		HashSet<Integer> set = new HashSet<Integer>(intList);
		
		return !(intList.size() == set.size());
	}
	public static void main(String args[]) {
		Integer[] vals = {1,3,5,6,8,9}; //{1,4,5,6,7,3,4,5,8};
		//boolean havingDuplicates = areThereDuplicates(vals);
//		boolean havingDuplicates = areThereDuplicatesMpp(Arrays.asList(vals));
		boolean havingDuplicates = areThereDuplicatesHashSet(Arrays.asList(vals));
		System.out.println("The array has duplicate values :" + havingDuplicates);
	}
	
}
