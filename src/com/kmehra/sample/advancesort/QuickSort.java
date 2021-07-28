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
	
	public static void main(String[] args) {
		
		int[] array = {28,41,4,11,16,1,40,14,36,37,42,18};//{5,2,1,8,4,7,6,3};
		
		int position = pivot(array, 0, array.length-1);
		
		System.out.println("Position of pivot point : " + position);
		
		System.out.println("The final Array is :: ");
		for(int i = 0; i<array.length; i++) {
			
			System.out.println(" " + array[i]);
		}
	}
	
}
