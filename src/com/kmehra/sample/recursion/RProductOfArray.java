package com.kmehra.sample.recursion;

import java.util.ArrayList;

public class RProductOfArray {
	
	public static int productOfArray(ArrayList<Integer> list) {
		
		if(list.size() == 0) {
			
			return 1;
		}
		
//		int value = list.get(0);
//		list.remove(0);
		
		return list.remove(0) * productOfArray(list);
	}
	
	public static void main(String args[]) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(10);
		
		int output = productOfArray(list);
		
		System.out.println("The product of array is : " + output);
		
	}
}
