package com.stack;

import java.util.*;

public class ArrayListStack<E> implements Stack<E>
{
	List<E> stack;
	
	public ArrayListStack()
	{
		stack = new ArrayList<E>();
	}
	
	@Override
	public int size()
	{
		return stack.size();
	}
	
	@Override
	public E peek()
	{
		if(stack.size() != 0)
			return stack.get(stack.size() - 1);
		else
		{
			System.out.println("Stack is Empty.");
			return null;
		}
	}
	
	@Override
	public void push(E node)
	{
		stack.add(node);
	}
	
	@Override
	public E pop()
	{
		if(stack.size() != 0)
		{
			E element = stack.get(stack.size() - 1);
			stack.remove(stack.size() - 1);
			return element;
		}
		else
		{
			System.out.println("Stack is Empty!");
			return null;
		}
	}
	
	@Override
	public boolean isEmpty()
	{
		if(stack.size() == 0)
			return true;
		else
			return false;
	}
}
