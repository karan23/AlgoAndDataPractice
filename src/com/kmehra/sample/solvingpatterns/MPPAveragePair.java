package com.kmehra.sample.solvingpatterns;

import java.util.Arrays;



public class MPPAveragePair {
	// Multiple pointer pattern(MPP) sorted array is there a pair for target average. 
	
	public static boolean averagePair(Integer[] vals, float target) {
		
		boolean isTargetAverage = false;
		
		int pre = 0;
		int post = vals.length - 1;

		while (post > pre) {
			
			float average = (float)(vals[pre] + vals[post])/2;
			
			if(average > target) {
				
				post--;
			} else if(average < target) {
				
				pre++;
			} else {
				
				return true;
			}
		}
		
		return isTargetAverage;
	}
	
	public static void main(String args[]) {
		
		Integer[] vals = {};//{-1,0,3,4,5,6};//{1,3,3,5,6,7,10,12,19};//{1,2,3};
		float target = 4;//4.1f;//8;//2.5f;
		boolean isTargetAverage = averagePair(vals, target);
		System.out.println("Target Average present in Array : " 
		+ isTargetAverage);
	}
	
}
