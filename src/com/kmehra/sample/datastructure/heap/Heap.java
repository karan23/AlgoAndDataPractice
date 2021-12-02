package com.kmehra.sample.datastructure.heap;

import java.util.ArrayList;

public class Heap {

	ArrayList<Integer> values = new ArrayList<>();

	public void insert(int i) {

		values.add(i);
		int index = values.size() - 1;
		bubbleUp(index);

	}

	public int extractMax() {
		int removedValue;
		if (values.size() == 1) {
			removedValue = values.get(0);
			values.remove(0);
		} else if (values.size() > 1) {

			removedValue = values.get(0);
			int lastIndex = values.size() - 1;
			values.set(0, values.get(lastIndex));
			values.remove(lastIndex);
			
			trickleDown(0);

		} else {
			removedValue = -1;
		}

		return removedValue;
	}

	private void trickleDown(int startIndex) {

		int currentIndex = startIndex;
		int length = this.values.size();
		int currentValue = this.values.get(currentIndex);

		while (currentIndex < values.size()) {

			int leftChildIndex = (2 * currentIndex) + 1;
			int rightChildIndex = (2 * currentIndex) + 2;

			Integer swap = null;
			Integer leftChildValue = 0;
			Integer rightChildValue;

			if (leftChildIndex < length) {

				leftChildValue = values.get(leftChildIndex);
				
				if(leftChildValue > currentValue) {
					swap = leftChildIndex;
				}
			}

			if (rightChildIndex < length) {

				rightChildValue = values.get(rightChildIndex);
				
				if((swap == null && rightChildValue > currentValue) 
						|| (swap != null && rightChildValue > leftChildValue)) {
					
					swap = rightChildIndex;
				}
			}
			
			if (swap == null)
				break;

			values.set(currentIndex, values.get(swap));
			values.set(swap, currentValue);
			
			currentIndex = swap;
			currentValue = values.get(swap);
		}

	}

	private void bubbleUp(int index) {

		int currentIndex = index;

		while (currentIndex > 0) {

			int parentIndex = (currentIndex - 1) / 2;
			if (values.get(parentIndex) < values.get(currentIndex)) {

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
