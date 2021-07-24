package com.kmehra.sample.solvingpatterns;

public class MPPCountUniqueValues {

	// Multiple pointer pattern(MPP) count unique values
	
	public static int countUniqueValues(int[] array) {
		
		int counter = 1;
		int post = 1,pre = 0 ;
		
		if(array.length == 0 
				|| array.length == 1) {
			return array.length;
		}
		
		while(post < array.length) {
			
			int val1 = array[pre];
			int val2 = array[post];
			
			if(val1 == val2) {
				post++;
			} else {
				pre = post;
				counter++;
			}
		}
		
		return counter;
		
	}
	
	public static void main(String args[]) {
	
		int[] vals = {1};//{1,1,1,1,1,1,2,3,7,7,7,8,8,8};
		int uniqueValues = countUniqueValues(vals);
		
		System.out.println("Total unique values in an array : " 
								+ uniqueValues);
	}
}
