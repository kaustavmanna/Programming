package com.queue;

import com.linkedlist.SingleListNode;

public class Queue<E>
{
	SingleListNode<E> front, rear;
	
	public Queue()
	{
		front = null;
		rear = null;
	}

	public void enQueue(E data)
	{
		SingleListNode<E> newnode = new SingleListNode<E> (data);
		
		if(isEmptyQueue())
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
	
	public E deQueue()
	{
		if(isEmptyQueue())
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
	
	public E front()
	{
		return front.getData();
	}
	
	public boolean isEmptyQueue()
	{
		if(front == null)
			return true;
		else
			return false;
	}
}
