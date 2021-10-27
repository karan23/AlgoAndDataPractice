package com.kmehra.sample.datastructures.stack;


public class Stack {

	private Node first, last;
	private int size;
	
	public Stack() {
		
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
	
	
	public Node push(String value) { // add to first position
		
		Node addingNode = new Node(value);
		
		
		if(this.size == 0) {
			
			this.first = addingNode;
			this.last = addingNode;
		} else {
			
			addingNode.next = this.first;
			this.first = addingNode;
		}
		
		this.size++;
		
		return addingNode;
	}
	
	public Node pop() { // remove from first position
		
		Node poppedNode = null;
		
		if(this.size == 0) {
			
			poppedNode = null;
		} else if(this.size == 1) {
			
			poppedNode = this.first;
			this.first = null;
			this.last = null;
			this.size--;
		} else {
			
			poppedNode = this.first;
			this.first = this.first.next;
			this.size--;
		}
		
		return poppedNode;
	}
}
