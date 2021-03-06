package com.kmehra.sample.datastructure.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

	private Node root;

	public BinarySearchTree() {
		this.root = null;
	}

	public Node insert(int value) {

		Node insertingNode = new Node(value);

		if (this.root == null) {
			this.root = insertingNode;
		} else {

			Node currentNode = this.root;
			boolean isInserted = false;

			while (!isInserted) {

				if (insertingNode.val < currentNode.val) {

					if (currentNode.left == null) {
						currentNode.left = insertingNode;
						System.out.println("Inserted below :: " + currentNode.val);
						isInserted = true;
					} else {
						currentNode = currentNode.left;
					}

				} else {

					if (currentNode.right == null) {
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

		if (root == null) {

			find = false;
		} else {

			while (current != null) {

				// System.out.println("value found ::" + current.val);
				if (value == current.val) {

					find = true;
					break;
				} else if (value < current.val) {

					current = current.left;
					break;

				} else if (value > current.val) {

					current = current.right;
				}
			}
		}

		return find;

	}
	
	public ArrayList<Node> DFSInOrdertraverse() {

		ArrayList<Node> visitedNodes = new ArrayList<>();
		traverseInOrder(root, visitedNodes);

		return visitedNodes;

	}

	private void traverseInOrder(Node node, ArrayList<Node> visitedNodes) {

		if (node.left != null) {
			traverseInOrder(node.left, visitedNodes);
		}

		visitedNodes.add(node);
		
		if (node.right != null) {
			traverseInOrder(node.right, visitedNodes);
		}

		
	}

	public ArrayList<Node> DFSPostOrdertraverse() {

		ArrayList<Node> visitedNodes = new ArrayList<>();
		traversePostOrder(root, visitedNodes);

		return visitedNodes;

	}

	private void traversePostOrder(Node node, ArrayList<Node> visitedNodes) {

		if (node.left != null) {
			traversePostOrder(node.left, visitedNodes);
		}

		if (node.right != null) {
			traversePostOrder(node.right, visitedNodes);
		}

		visitedNodes.add(node);
	}

	public ArrayList<Node> DFSPreOrdertraverse() {

		ArrayList<Node> visitedNodes = new ArrayList<>();
		traversePreOrder(root, visitedNodes);

		return visitedNodes;

	}

	private void traversePreOrder(Node node, ArrayList<Node> visitedNodes) {

		visitedNodes.add(node);

		if (node.left != null) {
			traversePreOrder(node.left, visitedNodes);
		}

		if (node.right != null) {
			traversePreOrder(node.right, visitedNodes);
		}
	}

	/**
	 * 
	 * @author Karan
	 *
	 *         Logic : make a queue to remember which next node is to be processed
	 *         and other list would be used for traversed list.
	 *
	 *         10 6 15 3 8 20
	 * 
	 */

	public ArrayList<Node> BSTtraverse() {

		ArrayList<Node> traversalList = new ArrayList<>();

		Queue<Node> queue = new LinkedList<>();

		queue.add(this.root);

		while (queue.size() > 0) {

			Node processNode = queue.poll();

			if (processNode.left != null)
				queue.add(processNode.left);

			if (processNode.right != null)
				queue.add(processNode.right);

			traversalList.add(processNode);
		}

		return traversalList;

	}

}
