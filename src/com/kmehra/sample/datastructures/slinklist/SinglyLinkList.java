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

	// printing all elements in linked list
	public void traverse() {

		Node current = this.head;

		System.out.println("Values in Link List ");
		while (current != null) {

			System.out.println(" " + current.val);
			current = current.next;
		}
	}

	// adding to last of sll
	public Node push(String value) {

		Node node = new Node(value);

		if (head == null) { // first node

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

		if (this.head == null) {

			return null;
		} else {

			while (current.next != null) {

				prevCurrent = current;
				current = current.next;
			}

			Node deletedNode = prevCurrent.next;
			prevCurrent.next = null;
			tail = prevCurrent;

			this.length--;

			if (length == 0) {

				head = tail = null;
			}
			return deletedNode;
		}
	}

	public void unshift(String value) { // adding value in front of sll

		Node newHead = new Node(value);
		if (this.head == null) {

			this.head = newHead;
			this.tail = newHead;
		} else {
			newHead.next = this.head;
			this.head = newHead;

		}

		this.length++;
	}

	public Node shifting() { // remove a node in begining

		if (head == null)
			return null;
		Node temp = head;
		this.head = head.next;

		temp.next = null;
		this.length--;

		return temp;
	}

	public Node get(int index) {

		int count = 0;

		if (this.head == null)
			return null;

		Node current = this.head;
		Node targetNode = null;

		while (current != null) { // while(count != index)

			if (count == index) {
				targetNode = current;
				break;
			}
			current = current.next;
			count++;
		}

		return targetNode;
	}

	// modify the value at index
	public boolean set(int index, String value) {

		Node node = get(index);
		boolean isUpdated = false;

		if (node != null) {

			node.val = value;
			isUpdated = true;
		}

		return isUpdated;
	}

	// create a new node and put it at index
	public boolean insert(int index, String value) {

		boolean isInserted = false;

		if (index < 0 || index > length) {

			isInserted = false;
		} else if (index == 0) {

			unshift(value);
			isInserted = true;
		} else if (index == length) {
			push(value);
		} else {

			Node node = get(index - 1);

			if (node == null) {

				isInserted = false;
			} else {

				Node temp = node.next;

				Node newNode = new Node(value);
				newNode.next = temp;
				node.next = newNode;
				isInserted = true;
				length++;
			}
		}

		return isInserted;
	}

	// removing the particular node at index
	public boolean remove(int index) {

		boolean isRemoved = false;

		if (index < 0 || index > length - 1) {

			isRemoved = false;
		} else if (index == 0) {

			shifting();
			isRemoved = true;
		} else if (index == length - 1) {

			pop();
			isRemoved = true;
		} else {

			Node preNode = get(index - 1);
			Node removingNode = get(index);
			preNode.next = removingNode.next;
			length--;
			isRemoved = true;
		}

		return isRemoved;
	}

	public boolean reverse() {

		// boolean isReversed = false;

		if (this.head == null)
			return false;
		if (this.head == this.tail)
			return true; // no need to reverse

		Node currentNode = this.head;
		this.head = this.tail;
		this.tail = currentNode;
		Node prevNode = null;
		Node nextNode = currentNode.next;

		while (currentNode != null) {

			currentNode.next = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;
			
			if(currentNode != null) {
				nextNode = currentNode.next;
			}

		}

		return true;
	}

}
