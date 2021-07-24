package com.kmehra.sample.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class RSomeRecursion {

	public static boolean someRecursion(List<Integer> intList, Predicate<Integer> callPredicate) {
		
		
		if(callPredicate.test(intList.get(0))) {
			return true;
		}
		
		if(intList.size() == 1) {
			
			return false;
		}
		
		intList.remove(0);
		
		return someRecursion(intList, callPredicate);
	}
	
	public static void main(String[] args) {
		
		Integer[] array = new Integer[] {4,6,8};//{4,6,8,9}; // {1,2,3,4}
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		intList.addAll(Arrays.asList(array));
//		boolean isSomeRecursion = someRecursion(intList, val -> val%2!=0);
		boolean isSomeRecursion = someRecursion(intList, val -> val>10);

		System.out.println("The list is satisfying some condition : " + isSomeRecursion);

	}

}
