package com.kmehra.sample.sort;

import java.util.Arrays;
import java.util.List;

public class InsertionSort {
	
	public static void insertionSort(List<Integer> list) {
		int length = list.size();
		for(int i=1; i<length; i++) { 
			
			int key = list.get(i); 
			
			int j = i - 1; 
			
			while(j >= 0 
					&& key < list.get(j)) {
				list.set(j+1, list.get(j)); 
				j = j-1; 
			}
			list.set(j+1, key);  
		}
	}
	
	
	public static void main(String[] args) {

		Integer[] array = {2,1,9,76,4};//{15,30,18,26,100,24,22,17,65,88,34,45};//{34,22,10,19,17}//{ 1, 2, 3, 8, 4, 5, 6, 7 };// {8,1,2,3,4,5,6,7};//{35,47,29,8};//

		List<Integer> list = Arrays.asList(array);
		
		insertionSort(list);
		
		System.out.println("The sorted List :");
		list.stream()
		.forEach(value -> System.out.println(" " + value));
	}

}
