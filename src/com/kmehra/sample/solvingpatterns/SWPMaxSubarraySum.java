package com.kmehra.sample.solvingpatterns;

// Sliding Window Pattern (SWP)
// find maximum sum of subarray with given size and consecutive numbers.
public class SWPMaxSubarraySum {
	
	
	public static Integer maxSubarraySum(Integer[] array, int size) {
		Integer maxSum = 0;
		Integer currentSum = 0;
		if(size > array.length) {
			return null;
		}
	
		for(int i = 0; i < array.length; i++) {
			
			if(i<size) {
				maxSum += array[i];
				currentSum = maxSum;
			} else {
				
				currentSum = currentSum - array[i-size] + array[i];
				maxSum = Math.max(maxSum, currentSum);
			}
		}
		
		return maxSum;
		
	}
	
	public static void main(String args[]) {
		
		Integer[] array = {1,4,2,10,23,3,1,0,20};//{100,200,300,400};
		int size = 4;//2;
		int maxValue = maxSubarraySum(array, size);
		
		System.out.println("Max value of array is : " + maxValue);
	}

}
