package com.kmehra.sample.advancesort;

public class MergeSort {
	
	public static int[] merge(int[] array1, int[] array2) {
		
		
		int arr1Length = array1.length;
		int arr2Length = array2.length;
		int size = arr1Length + arr2Length;
		
		int[] finalArray = new int[size];
		
		int posA1 = 0, posA2 = 0;
		
		
		for(int i = 0; i < size; i++) {
			
			int val = 0;
			
			if(posA1 == arr1Length) {
				
				val = array2[posA2];
				posA2++;
				
			} else if(posA2 == arr2Length) {
				
				val = array1[posA1];
				posA1++;
			} else if(array1[posA1] < array2[posA2]) {
				
				val = array1[posA1];
				posA1++;
				
			} else {
				
				val = array2[posA2];
				posA2++;
			}
			
			finalArray[i] = val;
		}
		
		return finalArray;
	}
	
	public static void main(String[] args) {
		
		int[] array1 = {1,10,50};
		int[] array2 = {2,14,99,100};
		
		int[] finalArray = merge(array1, array2);
		
		System.out.println("The final Sorted Array :: ");
		
		for(int i = 0; i<finalArray.length; i++) {
			
			System.out.println(" " + finalArray[i]);
		}
	}

}
