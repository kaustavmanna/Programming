package com.stack;

public class StackImpl
{
	public static void main(String[] args)
	{
		//Stack s = new DynamicArrayStack(3);
		ArrayListStack<Integer> s = new ArrayListStack<Integer> ();
		s.push(2);
		s.push(4);
		s.push(6);
		s.push(8);
		s.push(10);
		System.out.println("Element Deleted: " + s.pop());
		s.push(12);
		System.out.println("Current Top Element: " + s.peek());
		System.out.println("Element Deleted: " + s.pop());
		System.out.println("Current Top Element: " + s.peek());
		System.out.println("Element Deleted: " + s.pop());
		System.out.println("Current Top Element: " + s.peek());
		System.out.println("Element Deleted: " + s.pop());
		System.out.println("Current Top Element: " + s.peek());
		System.out.println("Element Deleted: " + s.pop());
		System.out.println("Current Top Element: " + s.peek());
		System.out.println("Element Deleted: " + s.pop());
		System.out.println("Current Top Element: " + s.peek());
	}

}
