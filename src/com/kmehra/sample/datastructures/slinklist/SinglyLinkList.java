package com.kmehra.sample.datastructures.slinklist;

import java.io.FilterInputStream;

public class SinglyLinkList {

	public Node head, tail;
	public int length;
	
	public SinglyLinkList() {
		
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	// adding to last of sll
	public Node push(String value) {
		
		Node node = new Node(value);
		
		if(head == null) { // first node
			
			this.head = node;
			this.tail = head;
		} else { // other nodes
			
			
			tail.next = node;
			tail = node;
		
		}
		
		length++;
		
		return node;
	}
	
	// removing the last element in SLL
	public Node pop() {
	
		Node current = this.head;
		Node prevCurrent = this.head;
		
		if(this.head == null) {
			
			return null;
		} else {
		
		while(current.next != null) {
			
			prevCurrent = current;
			current = current.next;
		}
		
		Node deletedNode = prevCurrent.next;
		prevCurrent.next = null;
		tail = prevCurrent;
		
		this.length--;
		
		if(length == 0) {
			
			head = tail = null;
		}
		return deletedNode;
		}
	}
	
	
	public void traverse() {
		
		Node current = this.head;
		
		System.out.println("Values in Link List ");
		while(current != null) {
			
			System.out.println(" " + current.val);
			current = current.next;
		}
	}
	
}
