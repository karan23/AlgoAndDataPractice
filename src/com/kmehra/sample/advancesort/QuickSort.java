package com.kmehra.sample.advancesort;

public class QuickSort {

	// returns the position of pivot point
	// assuming pivot to be start of array
	public static int pivot(int[] array, int start, int end) {
		
		int pivot = start;
		int lessValuesIndex = start+1;
		int pivotValue = array[start];
		for(int i= start+1; i<=end; i++) {
			int compareValue = array[i];
			
			if(pivotValue>compareValue) {
				
				array[i] = array[lessValuesIndex];
				array[lessValuesIndex] = compareValue;
				lessValuesIndex++;		
			}
		}
		
		int temp = array[start];
		array[start] = array[lessValuesIndex -1];
		array[lessValuesIndex -1] = temp; 
		return lessValuesIndex-1;
	}
	
	public static int[] quickSort(int[] array) {
		
		return quickSort(array, 0, array.length -1);
	}
	
	public static int[] quickSort(int[] array, int left, int right) {
		
		if(left < right) {
			
			int pivot = pivot(array, left, right);
			
			// left sorting
			quickSort(array, left, pivot-1);
			
			// right sorting
			quickSort(array, pivot+1, right);
		}
			
			
		return array;
		
		
		
	}
	
	public static void main(String[] args) {
		
		int[] array = {100,-3,2,4,6,9,1,2,5,3,23};//{26,23,27,44,17,47,39,42,43,1};//{28,41,4,11,16,1,40,14,36,37,42,18};//{5,2,1,8,4,7,6,3};
		
		quickSort(array);
		
		System.out.println("The final Array is :: ");
		for(int i = 0; i<array.length; i++) {
			
			System.out.println(" " + array[i]);
		}
	}
	
}
