package com.kmehra.sample.search;

import java.util.ArrayList;

public class SLinearSearch {

	public static int linearSearch(ArrayList<Integer> list, int search) {
		
		for(int i = 0; i<list.size(); i++ ) {
			
			if(list.get(i) == search)  {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String args[]) {
		
		int search = 8;
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(5);
		list.add(8);
		list.add(7);
		list.add(3);
		list.add(9);
		list.add(10);
		
		int postion = linearSearch(list, search);
		
		System.out.println("Postion of search value is :: " + postion );
	}
}
