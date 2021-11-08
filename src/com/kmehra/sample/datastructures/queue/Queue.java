package com.kmehra.sample.datastructures.queue;

public class Queue {

	private Node first, last;
	private int size;
	
	public Queue() {
		
		this.first = null;
		this.last = null;
		this.size = 0;
	}
	
	// printing all elements in linked list
			public void traverse() {

				Node current = this.first;

				System.out.println("Values in Link List with size : " + this.size );
				while (current != null) {

					System.out.println(" " + current.val);
					current = current.next;
				}
			}
	
	
	public Node enqueue(String value) { // add to last
		
		Node enQNode = new Node(value);
		
		if(this.size == 0) {
			
			this.first = enQNode;
			this.last = enQNode;
			
		} else {
			
			this.last.next = enQNode;
			this.last = enQNode;
			
		}
		
		this.size++;
		return enQNode;
	}
	
	public Node dequeue() { // remove from first
	
		Node deQNode = null;
		
		if(this.size == 0) {
			
			deQNode = null;
		} else if(this.size == 1) {
			
			deQNode = this.first;
			this.first = null;
			this.last = null;
			this.size--;
		} else {
			
			deQNode = this.first;
			this.first = this.first.next;
			this.size--;
		}
		
		return deQNode;
	}
}
