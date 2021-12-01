package com.kmehra.sample.datastructure.heap;

import java.util.ArrayList;

public class Heap {

	ArrayList<Integer> values = new ArrayList<>();
	
	public void insert(int i) {
		
		values.add(i);
		int index = values.size() - 1;
		bubbleUp(index);
		 
	}
	
	private void bubbleUp(int index) {
		
		
		int currentIndex = index;
		
		while(currentIndex > -1) {
			
			int parentIndex = (currentIndex - 1)/2;
			if(values.get(parentIndex) < values.get(currentIndex)) {
				
				// exchange the value
				int temp = values.get(currentIndex);
				values.set(currentIndex, values.get(parentIndex));
				values.set(parentIndex, temp);
				
			} else {
				
				break;
			}
			currentIndex = parentIndex;
		}
		
	}
	
}
