package com.stack;

public class StackImpl
{
	public static void main(String[] args)
	{
		TwoStackUsingArray stack = new TwoStackUsingArray(100);
		stack.push(1,10);
		stack.push(2,11);
		stack.push(1,20);
		stack.push(2,21);
		stack.push(1,30);

		System.out.println("Current Stack 1 Top Element: " + stack.peek(1));
		System.out.println("Current Stack 2 Top Element: " + stack.peek(2));

		System.out.println("Element deleted From Stack 1: " + stack.pop(1));
		System.out.println("Element deleted From Stack 2: " + stack.pop(2));
		System.out.println("Element deleted From Stack 2: " + stack.pop(2));

		System.out.println("Is Stack 1 Empty: " + stack.isEmpty(1));
		System.out.println("Is Stack 2 Empty: " + stack.isEmpty(2));

		System.out.println("Stack 1 size: " + stack.size(1));
		System.out.println("Stack 2 size: " + stack.size(2));
	}

}
