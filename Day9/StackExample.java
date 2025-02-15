package com.celcom.day9;

import java.util.Stack;

public class StackExample {
	public static void main(String args[]) {
		Stack<Integer> stack1 = new Stack<>();
		stack1.push(10);
		stack1.push(14);
		stack1.push(12);
		stack1.push(19);
		stack1.push(21);
		System.out.println("Contents in stack");
		System.out.println(stack1);

		System.out.println("Returns and removes first element");
		stack1.pop();
		System.out.println("Contents in stack");
		System.out.println(stack1);

		System.out.println("Just Returns first element");
		System.out.println("Contents in stack");
		System.out.println(stack1.peek());
	}
}
