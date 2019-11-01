/**
 * @author kaustavmanna
 *
 */

package com.queue;

import com.linkedlist.SingleListNode;

public class ListNodeQueue<E> implements Queue<E>
{
	private SingleListNode<E> front, rear;
	
	public ListNodeQueue()
	{
		front = null;
		rear = null;
	}

	@Override
	public int size()
	{
		if(front == null)
			return 0;
		else
		{
			SingleListNode<E> trav = front;
			int count = 1;
			
			while(trav != rear)
			{
				count++;
				trav = trav.getNext();
			}
			return count;
		}
	}
	
	@Override
	public void enQueue(E data)
	{
		SingleListNode<E> newnode = new SingleListNode<E> (data);
		
		if(isEmpty())
		{
			front = newnode;
			rear = newnode;
		}
		
		else
		{
			rear.setNext(newnode);
			rear = newnode;
		}
	}
	
	@Override
	public E deQueue()
	{
		if(isEmpty())
		{
			System.out.println("Empty Queue");
			return null;
		}
		else
		{
			SingleListNode<E> N = front;
			front = front.getNext();
			return N.getData();
		}
	}
	
	@Override
	public E front()
	{
		return front.getData();
	}
	
	@Override
	public boolean isEmpty()
	{
		if(front == null)
			return true;
		else
			return false;
	}
}
