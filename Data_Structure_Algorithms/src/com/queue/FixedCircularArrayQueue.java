/**
 * @author kaustavmanna
 *
 */

package com.queue;

public class FixedCircularArrayQueue
{
	private int front, rear;
	private Integer queue[];
	
	public FixedCircularArrayQueue(int capacity)
	{
		queue = new Integer[capacity];
		front = 0;
		rear = 0;
	}
	
	public void enQueue(Integer data)
	{
		if((rear == queue.length - 1 && front == 0) || (rear + 1) == front)
			System.out.println("Queue Overflow");
		
		else if(rear == queue.length - 1)
		{
			rear = 0;
			queue[rear] = data;
		}
		else
			queue[++rear] = data;
	}
	
	public Integer deQueue()
	{
		if(isEmptyQueue())
		{
			System.out.println("Empty Queue");
			return null;
		}
		else if(front == queue.length - 1)
		{
			front = 0;
			return queue[front];
		}
		else
		{
			return queue[++front];
		}
	}
	
	public Integer front()
	{
		if(isEmptyQueue())
		{
			System.out.println("Empty Queue");
			return null;
		}
		else
			return queue[front];
	}
	
	public boolean isEmptyQueue()
	{
		if(front == rear)
			return true;
		else
			return false;
	}
}
