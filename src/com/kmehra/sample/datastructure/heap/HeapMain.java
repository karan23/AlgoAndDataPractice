package com.kmehra.sample.datastructure.heap;

import java.util.ArrayList;

public class HeapMain {

	public static void main(String[] args) {
		
		Heap heap = new Heap();
		heap.insert(41);
		heap.insert(39);
		heap.insert(33);
		heap.insert(18);
		heap.insert(27);
		heap.insert(12);
		heap.insert(55);
		
		ArrayList<Integer> values = heap.values;
		
		values.stream().forEach(value -> System.out.println("Value is : " + value));
		
		heap.extractMax();
		heap.extractMax();
	
		System.out.println();
		values.stream().forEach(value -> System.out.println("Value is : " + value));
	}
	

}
