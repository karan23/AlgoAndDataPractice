package com.kmehra.sample.datastructure.tree;

public class Node {
	
	
	public int val;
	public Node left, right;

	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	
	
	public Node(int val) {
		super();
		this.val = val;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	
	
	
	
	
}
