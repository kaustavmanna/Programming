/**
 * @author kaustavmanna
 *
 */

package com.queue;

import java.util.LinkedList;

public class LinkedListQueue<E> implements Queue<E>
{
	private LinkedList<E> queue;
	
	public LinkedListQueue()
	{
		queue = new LinkedList<E>();
	}

	@Override
	public E front()
	{
		return queue.getFirst();
	}
	
	@Override
	public int size()
	{
		return queue.size();
	}
	
	@Override
	public void enQueue(E data)
	{
		queue.addLast(data);
	}
	
	@Override
	public E deQueue()
	{
		if(!queue.isEmpty())
			return queue.removeFirst();
		
		System.out.println("Queue is empty!");
		return null;
	}
	
	@Override
	public boolean isEmpty()
	{
		if(queue.isEmpty())
			return true;
		else
			return false;
	}
}
