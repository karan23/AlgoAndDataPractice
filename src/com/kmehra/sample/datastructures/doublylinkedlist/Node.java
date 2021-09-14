package com.kmehra.sample.datastructures.doublylinkedlist;

public class Node {

	public Node prev;
	public Node next;
	public String value;
	
	public Node(String value) {
	
		this.value = value;
		this.next = null;
		this.prev = null;
	}
	
	
}
