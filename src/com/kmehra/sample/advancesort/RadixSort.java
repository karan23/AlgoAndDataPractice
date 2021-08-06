package com.kmehra.sample.advancesort;

public class RadixSort {

	public static int maxDigitCount(int[] array) {
		
		int size = array.length;
		int max = 0;
		for(int i = 0 ; i<size; i++) {
			
			int number = array[i];
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
	
	public static void main(String[] args) {
		
//		int number = 12345;
//		int position = 2;//0;
//		
//		int output = getDigit(number, position);
		
//		int number = 984647;
//		int output = digitCount(number);
		
		int[] array = {1,1111,1111111,11,111};
		int output = maxDigitCount(array);
		
		System.out.println("The value is :: " + output);
	}
}
