package com.kmehra.sample.datastructure.tree;

public class BinarySearchTree {

	private Node root;
	
	public BinarySearchTree() {
		this.root = null;
	}
	
	public Node insert(int value) {
		
		Node insertingNode = new Node(value);
		
		if(this.root == null) {
			this.root = insertingNode;
		} else {
			
			Node currentNode = this.root;
			boolean isInserted = false;
			
			while(!isInserted) {
				
				if(insertingNode.val < currentNode.val) {
					
					if(currentNode.left == null) {
						currentNode.left = insertingNode;
						System.out.println("Inserted below :: " + currentNode.val);
						isInserted = true;
					} else {
						currentNode = currentNode.left;
					}
					
					
				} else {
					
					if(currentNode.right == null) {
						currentNode.right = insertingNode;
						System.out.println("Inserted below :: " + currentNode.val);
						isInserted = true;
					} else {
						currentNode = currentNode.right;
					}
				}
			}
		}
		
		return insertingNode;
	}

	public boolean find(int value) {
		
		boolean find = false;
		
		Node current = this.root;
		
		if(root == null) {
			
			find = false;
		} else {
			
			while(current != null) {
				
				System.out.println("value found ::" + current.val);
				if(value == current.val) {
				
					find = true;
					break;
				} else if(value < current.val) {
					
					current = current.left;
					
				} else if(value > current.val) {
					
					current = current.right;
				}
			}
		}
		
		return find;
		
	}
}
