package com.kmehra.sample.advancesort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RadixSort {

	public static int maxDigitCount(List<Integer> list) {
		
		int size = list.size();
		int max = 0;
		for(int i = 0 ; i<size; i++) {
			
			int number = list.get(i);
			max = Math.max(digitCount(number), max);
		}
		
		return max;
	}
	
	public static int digitCount(int number) {
		
		int value = (int) Math.floor(Math.abs(Math.log10(number) + 1));
		return value;
	}
	
	public static int getDigit(int number, int position) {
		int value = (int) (Math.floor( Math.abs(number) / Math.pow( 10, position)));
		int numb = value % 10;
		return numb;
	}
	
	public static List<Integer> radixSort(List<Integer> list) {
		
		// get max digit
		int maxDigit = maxDigitCount(list);
		
		
		for(int k = 0; k< maxDigit; k++) {
			
			
			ArrayList<Integer>[] tenArray = new ArrayList[10];
			
			for(int i = 0; i<list.size(); i++) {
				
				int number = list.get(i);
				int val = getDigit(number, k);
				
				ArrayList<Integer> placeList = tenArray[val];
				if(placeList == null) {
					placeList = new ArrayList<>();
					tenArray[val] =  placeList;
				}
				
				placeList.add(number);
			}
			
			list = new ArrayList<>();
			for(int i = 0; i < 10; i++) {
				
				ArrayList<Integer> posList = tenArray[i]; 
				
				if(posList != null) {
					list.addAll(posList);
				}
			}
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		
//		int number = 12345;
//		int position = 2;//0;
//		
//		int output = getDigit(number, position);
		
//		int number = 984647;
//		int output = digitCount(number);
		
//		int[] array = {1,1111,1111111,11,111};
//		int output = maxDigitCount(array);
//		
//		System.out.println("The value is :: " + output);
		
		
		Integer[] array = {23,345,5467,12,2345,9852};//{34,22,10,19,17};

		List<Integer> list = Arrays.asList(array);
		
		List<Integer> outputList = radixSort(list);
		
		System.out.println("The radix sorted array is :: ");
		outputList.stream().forEach(value -> System.out.println(" " + value));
	}
}
