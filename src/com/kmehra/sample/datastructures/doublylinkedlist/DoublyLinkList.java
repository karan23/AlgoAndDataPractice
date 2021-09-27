package com.kmehra.sample.datastructures.doublylinkedlist;


public class DoublyLinkList {

	public Node head, tail;
	public int length;
	
	public DoublyLinkList() {
		
		this.head = null;
		this.tail = null;
		this.length = 0;
		
	}
	
	
	// printing all elements in linked list
		public void traverse() {

			Node current = this.head;

			System.out.println("Values in Link List of length " + this.length);
			while (current != null) {

				System.out.println(" " + current.value);
				current = current.next;
			}
		}
	
	// adding to last of sll
	public Node push(String value) {
		
		Node newNode = new Node(value);
		
		if(head == null) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			
			
			this.tail.next = newNode;
			newNode.prev = this.tail;
			
			tail = newNode;
		}
		
		this.length++;
		return newNode;
	}
	
	// removing the last element in SLL
		public Node pop() {
			
			Node popNode = null;
			if(head == tail && head != null) {
				head = null;
				tail = null;	
				length--;
			} else if(head != null && tail != null) {
				
				Node newTail = tail.prev;
				newTail.next = null;
				popNode = tail;
				tail.prev = null;
				tail = newTail;
				length--;
				
			}
			return popNode;
		}

		
		public Node shifting() { // remove a node in begining
			Node shiftedNode = head;
			
			if(this.head != null) {
				
				if(this.length == 1) {
					
					this.head = null;
					this.tail = null;
					
				} else {
					
					this.head = this.head.next;
					if(this.head != null) {
						this.head.prev = null;
					}
				}
				shiftedNode.next = null;
				
				length--;
			}
			
			return shiftedNode;
		}
		
		public void unshift(String value) { // adding value in front of sll
			
			Node newHead = new Node(value);
		
			if(this.head == null) {
				
				this.head = newHead;
				this.tail = newHead;
			} else {
				
				this.head.prev = newHead;
				newHead.next = this.head;
				
				this.head = newHead;
			}
			
			this.length++;
		}
		
		public Node get(int index) {
			
			if(index < 0 || index >= this.length) {
				
				return null;
			}
			
			int middle = length/2;
			int count = 0;
			Node traverseNode;
			if(index <= middle ) {
				System.out.println("working from first half");
				traverseNode = this.head;
				while(count != index) {
					
					traverseNode = traverseNode.next;
					count++;
				}
				
			} else {
				
				System.out.println("working from second half");
				traverseNode = this.tail;
				count = this.length-1;
				while(count != index) {
					
					traverseNode = traverseNode.prev;
					count--; 
				}
			}
			
			return traverseNode;
		}
		
		
		// modify the value at index
		public boolean set(int index, String value) {
			boolean isChanged = false; 
			Node node = get(index);
			
			if(node != null) {
				
				node.value = value;
				isChanged = true;
			}
			
			return isChanged;
		}
		
		
		// create a new node and put it at index
		public boolean insert(int index, String value) {
			
			Node newNode = new Node(value);
			boolean isInserted = false;
			
			 if(this.length == 0) {
				
				unshift(value);
				isInserted = true;
			} else if(this.length == index) {
				
				push(value);
				isInserted = true;
			} else if(index > 0 
					&& index < this.length) {
				
				Node currentNode = get(index);
				newNode.prev = currentNode.prev;
				
				newNode.next = currentNode;
				if(newNode.prev != null) {
					newNode.prev.next = newNode;
				}
				currentNode.prev = newNode;
				this.length++;
				isInserted = true;
			} 
			
			
			
			return isInserted;
		}
		
		// removing the particular node at index
		public boolean remove(int index) {
			
			boolean isRemoved = false;
			
			if(index == 0) {
				
				shifting();
				isRemoved = true;
			} else if(index == this.length -1) {
				
				pop();
				isRemoved = true;
			} else if(index > 0
					&& index < this.length) {
				
				Node currentNode = get(index);
				currentNode.prev.next = currentNode.next;
				currentNode.next.prev = currentNode.prev;
				
				currentNode.next = null;
				currentNode.prev = null;		
				
				this.length--;
				isRemoved = true;
			}
			
			return isRemoved;
		}
}
