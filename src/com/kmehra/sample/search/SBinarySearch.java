package com.kmehra.sample.search;

import java.util.ArrayList;

public class SBinarySearch {

	public static int binarySearch(ArrayList<Integer> sortedList, int search) {
		
		int minPos = 0;
		int maxPos = sortedList.size() - 1;
		
		while(minPos < maxPos) {
			
			int between = (minPos + maxPos)/2;
			
			if(search > sortedList.get(between)) {
				
				minPos = between + 1;
			} else if(search < sortedList.get(between)) {
				
				maxPos = between-1; 
			} else if(search == sortedList.get(between)) {
				
				return between;
			} else {
				
				return -1;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> sortedList = new ArrayList<>();
		sortedList.add(1);
		sortedList.add(5);
		sortedList.add(9);
		sortedList.add(12);
		sortedList.add(15);
		sortedList.add(17);
		sortedList.add(19);
		sortedList.add(21);
		sortedList.add(24);
		sortedList.add(26);
		sortedList.add(30);

		int search = 29;
		
		int position = binarySearch(sortedList, search);
		System.out.println("The index of serach value is :: " + position);
	}

}
