package com.siddu.java.collections;

import java.util.Stack;

public class StackConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// along with list methods, there are 3 new methods to support stack data
		// structure
		// push(element), pop(), peek()
		// Stack class is inherited from Vector class

		Stack<String> stack = new Stack<String>();

		stack.add("Richard");
		stack.add("Kevin");
		stack.add("Mark");
		stack.add("Wilson");

		System.out.println("STACK Elements: " + stack);
		stack.push("Yuvraj");
		stack.push("Singh");

		System.out.println("STACK Elements: " + stack);

		stack.pop();

		System.out.println("STACK Elements: " + stack);

		// to get the top element: stack.peek()
		System.out.println(stack.peek());

	}

}
