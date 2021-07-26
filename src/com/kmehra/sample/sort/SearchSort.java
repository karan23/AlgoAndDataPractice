package com.kmehra.sample.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Selection Sort : Find the min value and place it to the beginning 
// of the array and do it until the array is not sorted.

public class SearchSort {

	public static void selectionSort(List<Integer> list) {
		
		int minPos = 0;
		for(int i = 0; i< list.size(); i++) {
			minPos = i;
			for(int j=i+1; j<list.size(); j++) {
				
				minPos = list.get(j)<list.get(minPos)?j:minPos;
			}
			
			if(i != minPos) {
			Collections.swap(list, i, minPos);
			}
		}
	}
	
	public static void main(String[] args) {

		Integer[] array = {34,22,10,19,17};//{15,30,18,26,100,24,22,17,65,88,34,45};//{ 1, 2, 3, 8, 4, 5, 6, 7 };// {8,1,2,3,4,5,6,7};//{35,47,29,8};//

		List<Integer> list = Arrays.asList(array);
		
		selectionSort(list);
		
		System.out.println("The sorted List :");
		list.stream()
		.forEach(value -> System.out.println(" " + value));
	}

}
