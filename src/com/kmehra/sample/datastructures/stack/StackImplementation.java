package com.kmehra.sample.datastructures.stack;

public class StackImplementation {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		
		stack.push("Delhi");
		stack.push("Maharashtra");
		stack.push("Punjab");
		stack.push("Chennai");
		
		
	//	stack.traverse();
		
		pop(stack);		
		stack.traverse();
		
		pop(stack);		
		stack.traverse();
		
		pop(stack);		
		stack.traverse();
		
		pop(stack);		
		stack.traverse();
		
		pop(stack);		
		stack.traverse();
		
	}
	
	public static void pop(Stack stack) {
		
		Node poppedValue = null;

		poppedValue = stack.pop();
		
		if(poppedValue != null) {
			System.out.println("Popped Value : " + poppedValue.val);
		}
	}
	
}
