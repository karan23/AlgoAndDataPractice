package com.kmehra.sample.datastructure.tree;

import java.util.ArrayList;

public class BSTImplementation {

	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
//		bst.insert(10);
//		bst.insert(5);
//		bst.insert(13);
//		bst.insert(11);
//		bst.insert(2);
//		bst.insert(16);
//		bst.insert(7);
	
		//boolean isFound = bst.find(7);
		
		
	//	System.out.println("Value found :: " + isFound);
		
		bst.insert(10);
		bst.insert(6);
		bst.insert(15);
		bst.insert(3);
		bst.insert(8);
		bst.insert(20);
		
		
		
		ArrayList<Node> traversedNodes = bst.DFSInOrdertraverse();//bst.DFSPostOrdertraverse();//bst.DFSPreOrdertraverse();//bst.BSTtraverse();
		
		traversedNodes.stream().forEach(node -> System.out.println("Node Value :: " + node.val));
	}

}
