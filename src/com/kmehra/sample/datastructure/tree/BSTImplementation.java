package com.kmehra.sample.datastructure.tree;

public class BSTImplementation {

	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(10);
		bst.insert(5);
		bst.insert(13);
		bst.insert(11);
		bst.insert(2);
		bst.insert(16);
		bst.insert(7);
	
		boolean isFound = bst.find(7);
		
		
		System.out.println("Value found :: " + isFound);
		
	}

}
