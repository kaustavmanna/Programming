package com.stack;

import com.linkedlist.SingleListNode;

public class LinkedListStack<E> implements Stack<E>
{
	private SingleListNode<E> stack;
	private int size;
	
	public LinkedListStack()
	{
		stack = null;
		size = 0;
	}
	
	public int size()
	{
		return this.size;
	}
	
	public E peek()
	{
		if(stack != null)
			return stack.getData();
		else
		{
			System.out.println("Stack is Empty.");
			return null;
		}
	}
	
	public void push(E data)
	{
		SingleListNode<E> newnode = new SingleListNode<E> (data);
		
		if(stack == null)
			stack = newnode;
		else
		{
			newnode.setNext(stack);
			stack = newnode;
		}
		
		size++;
	}
	
	public E pop()
	{
		if(stack!= null)
		{
			E data = stack.getData();
			stack = stack.getNext();
			size--;
			return data;
		}
		
		else
		{
			System.out.println("Stack is Empty.");
			return null;
		}
	}
	
	public boolean isEmpty()
	{
		if(stack == null)
			return true;
		else
			return false;
	}
}
