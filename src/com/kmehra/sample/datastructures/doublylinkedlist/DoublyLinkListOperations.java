package com.kmehra.sample.datastructures.doublylinkedlist;

public class DoublyLinkListOperations {

	public static void main(String[] args) {
		
		DoublyLinkList ddl = new DoublyLinkList();
		//ddl.push("hello");
		//ddl.traverse();
		//ddl.push("there");
//		ddl.unshift("HEMAN");
		//ddl.traverse();
		
//		ddl.reverse();
//		ddl.traverse();
		ddl.push("SUPERMAN");
		//ddl.shifting();
	
//		ddl.reverse();
//		ddl.traverse();
		
		ddl.push("HEMAN");
		ddl.push("BATMAN");
		ddl.push("SPIDERMAN");
		ddl.push("ANTMAN");
		ddl.push("IRONMAN");
		ddl.push("CAPTAN AMERICA");
		//ddl.traverse();
		
//		Node node = ddl.get(5);
//		System.out.println();
//		System.out.println("The node at given position is :: " + node.value);
		
		//boolean isChanged = ddl.set(-3, "HULK");
		//boolean isChanged = ddl.insert(3, "HULK");
	//	boolean isChanged = ddl.remove(4);
//		System.out.println();
//		System.out.println("Value is changed :: " + isChanged);
		
		ddl.reverse();
		ddl.traverse();
		
		//ddl.shifting();
		//ddl.traverse();
//		ddl.pop();
//		ddl.traverse();
	}

}
