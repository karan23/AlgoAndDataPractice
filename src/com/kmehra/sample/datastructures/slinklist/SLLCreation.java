package com.kmehra.sample.datastructures.slinklist;

//Singly link list
//intial example of creation
public class SLLCreation {

	public static void main(String[] args) {
		
//		Node node = new Node("hi");
//		Node first = node;
//		node.next = new Node("how");
//		node.next.next = new Node("are");
//		node.next.next.next = new Node("you");

		SinglyLinkList singlyLinkList = new SinglyLinkList();
		
		singlyLinkList.push("hello");
 		singlyLinkList.push("there");
		singlyLinkList.push("how");
		singlyLinkList.push("are");
		singlyLinkList.push("you");
		
		// singlyLinkList.traverse();
		
		//Node dNode = singlyLinkList.pop();
//		dNode = singlyLinkList.pop();
		
//		String value =  dNode != null ? dNode.val : "null";
//		System.out.println("Node value : " + value + " and length is : " + singlyLinkList.length);
 		
		singlyLinkList.traverse();
	//	singlyLinkList.unshift("My");
// 		singlyLinkList.shifting();
 //		singlyLinkList.traverse();
		
		Node node = singlyLinkList.get(2);
		String value =  node != null ? node.val : "null";
		System.out.println("Node value : " + value + " and length is : " + singlyLinkList.length);
	}
	
}
