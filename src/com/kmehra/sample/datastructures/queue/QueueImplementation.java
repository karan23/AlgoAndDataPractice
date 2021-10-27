package com.kmehra.sample.datastructures.queue;


public class QueueImplementation {

	public static void main(String[] args) {
		
		Queue queue = new Queue();
		
		queue.enqueue("First");
		queue.enqueue("Two");
		queue.enqueue("Three");
		queue.enqueue("Four");
		queue.enqueue("Five");

		queue.traverse();
		
		dequeue(queue);
		queue.traverse();
		
		dequeue(queue);
		queue.traverse();
		
		dequeue(queue);
		queue.traverse();
		
		dequeue(queue);
		queue.traverse();
		
		dequeue(queue);
		queue.traverse();
		
		dequeue(queue);
		queue.traverse();
	}

	
public static void dequeue(Queue queue) {
		
		Node poppedValue = null;

		poppedValue = queue.dequeue();
		
		if(poppedValue != null) {
			System.out.println("Popped Value : " + poppedValue.val);
		}
	}
}
