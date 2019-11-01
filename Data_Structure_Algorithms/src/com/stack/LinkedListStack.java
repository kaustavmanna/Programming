/**
 * @author kaustavmanna
 *
 */

package com.stack;

import java.util.LinkedList;

public class LinkedListStack<E> implements Stack<E>
{
	private LinkedList<E> stack;
	
	public LinkedListStack()
	{
		stack = new LinkedList<E>();
	}
	
	@Override
	public E peek()
	{
		if(stack.isEmpty())
			return null;
		else
			return stack.getFirst();
	}
	
	@Override
	public void push(E data)
	{
		stack.addFirst(data);
	}
	
	@Override
	public E pop()
	{
		if(stack.isEmpty())
			return null;
		else
			return stack.removeFirst();
	}
	
	@Override
	public boolean isEmpty()
	{
		if (stack.isEmpty())
			return true;
		else
			return false;
	}
	
	@Override
	public int size()
	{
		return stack.size();
	}
}
