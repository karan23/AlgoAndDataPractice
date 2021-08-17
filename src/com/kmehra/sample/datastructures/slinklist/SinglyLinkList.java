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
		
		if(this.head == null) return null;
			
		Node current = this.head;
		Node targetNode = null;
		
		while(current != null) { // while(count != index)
			
			if(count == index) {
				targetNode = current;
				break;
			}
			current = current.next;
			count++;
		}
		
		return targetNode;
	}

}
