package com.kmehra.sample.solvingpatterns;

import java.util.Arrays;



public class MPPSumZero {
	// Multiple pointer pattern(MPP) find a pair for sum as 0. 
	
	public static int[] sumZero(int[] array) {
		
		int[] resultArray = {};
		 
		int i = 0;
		int j = array.length-1;
		
		while(j>i) {
			int val1 = array[i];
			int val2 = array[j];
			
			int sum = val1 + val2;
			
			if(sum > 0) {
				j--;
			} else if(sum < 0) {
				i++;
			} else {
				
				resultArray = new int[2];
				resultArray[0] = val1;
				resultArray[1] = val2;
				break;
			}
		}
		
		return resultArray;
	}
	
	public static void main(String args[]) {
		
		int[] vals = {-5,-4,-1,0,1,2,3};
		int[] op = sumZero(vals);
		
		System.out.println("the op is : " + Arrays.toString(op));
	}
	
}
