package com.kmehra.sample.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Bubble sort
// compare adjacent values and exchange value 
// if left value is more than right value

// optimized bubble sort : when array is almost sorted
// check whether we have swapped in j iteration with the help 
// of boolean and if not then break.

public class BubbleSort {
	
	public static void bubbleSort(List<Integer> list) {

		for(int i= 0; i<list.size(); i++) {
			
			for(int j = 0; j<list.size()-i-1; j++) {
				
				if(list.get(j+1) < list.get(j)) {
					
					Collections.swap(list, j+1, j);

				}
			}

		}
	}
	
	public static void optimizedBubbleSort(List<Integer> list) {

		boolean isSwapped;
		for(int i= 0; i<list.size(); i++) {
			isSwapped = false;
			for(int j = 0; j<list.size()-i-1; j++) {
				
				if(list.get(j+1) < list.get(j)) {
					isSwapped = true;
					Collections.swap(list, j+1, j);

				}
			}

			if(!isSwapped) {
				
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		
		Integer[] array = {1,2,3,8,4,5,6,7};//{8,1,2,3,4,5,6,7};//{35,47,29,8};//{15,30,18,26,100,24,22,17,65,88,34,45};
		
		List<Integer> list = Arrays.asList(array);
		
		//bubbleSort(list);
		
		optimizedBubbleSort(list);
		System.out.println("The sorted List :");
		list.stream()
		.forEach(value -> System.out.println(" " + value));
		
	}

}
