package com.kmehra.sample.datastructures.doublylinkedlist;

public class DoublyLinkListOperations {

	public static void main(String[] args) {
		
		DoublyLinkList ddl = new DoublyLinkList();
		//ddl.push("hello");
		//ddl.traverse();
		//ddl.push("there");
//		ddl.unshift("HEMAN");
		//ddl.traverse();
		ddl.push("SUPERMAN");
		//ddl.shifting();
	
		ddl.push("HEMAN");
		ddl.push("BATMAN");
		ddl.push("SPIDERMAN");
		ddl.push("ANTMAN");
		ddl.push("IRONMAN");
		ddl.push("CAPTAN AMERICA");
		ddl.traverse();
		
		Node node = ddl.get(5);
		System.out.println();
		System.out.println("The node at given position is :: " + node.value);
		//ddl.shifting();
		//ddl.traverse();
//		ddl.pop();
//		ddl.traverse();
	}

}
