/**
 * @author kaustavmanna
 *
 */

package com.queue;

import java.util.Stack;

public class QueueUsingStack<E> implements Queue<E>
{
	Stack<E> stack1;
	Stack<E> stack2;
	
	public QueueUsingStack()
	{
		stack1 = new Stack<E>();
		stack2 = new Stack<E>();
	}
	
	@Override
	public void enQueue(E data)
	{
		
	}
	
	@Override
	public E deQueue()
	{
		return null;
	}
	
	@Override
	public E front()
	{
		return null;
	}
	
	@Override
	public boolean isEmpty()
	{
		return true;
	}
	
	@Override
	public int size()
	{
		return 0;
	}
}
