package com.kmehra.sample.solvingpatterns;

// SWP
// Write a function called minSubArrayLen  which accepts two parameters
// - an array of positive integers and a positive integer. 
// This function should return the minimal length of a 
//  subarray of which the sum is greater than or equal 
// to the integer passed to the function. If there isn't one,
// return 0 instead.
public class SWPMinSubarrayLength {

	public static int minSubArrayLen(int[] array, int target) {
		
		int total = 0;
		int start = 0;
		int end = 0;
		int min = Integer.MAX_VALUE;
		
		while(start < array.length) {
			
			if(total < target 
					&& end < array.length) {
				
				total += array[end]; 
				end++;
			} else if(total >= target) {
				
				min = Math.min(min, end-start);
				total = total - array[start];
				start++;
				
			} else {
				break;
			}
			
		}
		
		return min == Integer.MAX_VALUE ? 0 : min;
	}
	
	public static void main(String[] args) {
		
		int[] array = {1,4,16,22,5,7,8,9,10};//{4,3,3,8,1,2,3};//{1,4,16,22,5,7,8,9,10};//{3,1,7,11,2,9,8,21,62,33,19};//{2,1,6,5,4};//{2,3,1,2,4,3};
		int target = 95;//11;//55;//39;//52;//9;//7;
		int size = minSubArrayLen(array, target);
		
		System.out.println("The length of shortest subarray is : " + size);
	}

}
