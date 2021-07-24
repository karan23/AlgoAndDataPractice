package com.kmehra.sample.solvingpatterns;

public class SWPMaxConsecutiveSubarray {

	public static int maxSubarraySum(int[] array, int windowSize) {
		
		int maxSum = 0;
		
		if(windowSize > array.length) {
			
			return 0;
		}
		
		int currentSum = 0;
		
		for(int i = 0; i <= array.length - windowSize; i++) {
			
			if(i == 0) {
				
				for(int j = 0; j < windowSize; j++) {
					
					maxSum += array[j];
					currentSum = maxSum;
				}
			} else {
				
				currentSum = currentSum - array[i-1] + array[i+windowSize-1];
				
				maxSum = Math.max(maxSum, currentSum);
				/*
				 * if(maxSum < currentSum) {
				 * 
				 * maxSum = currentSum; }
				 */
			}
			
		}
		
		return maxSum;
	}
	
	public static void main(String args[]) {
		
		int[] array = {2,6,9,2,1,8,5,6,3};//{2,17,44,9,2,25,9,8,5};
		int sum = maxSubarraySum(array, 3);
		System.out.println("Max sub Array Sum is : " + sum);
	}
}
