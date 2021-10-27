package com.kmehra.sample.datastructures.stack;

public class Node {


	public String val;
	public Node next;
	
	public Node(String val) {
		super();
		this.val = val;
	}
	public String getVal() {
		return val;
	}
	public void setVal(String val) {
		this.val = val;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}
