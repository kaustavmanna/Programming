/**
 * @author kaustavmanna
 *
 */

package com.queue;

public class DynamicCircularArrayQueue
{
	private int front, rear;
	private Integer queue[];
	
	public DynamicCircularArrayQueue(int capacity)
	{
		queue = new Integer[capacity];
		front = 0;
		rear = 0;
	}
	
	public void enQueue(Integer data)
	{
		if((rear == queue.length - 1 && front == 0) || (rear + 1) == front)
		{
			Integer newqueue[] = new Integer[queue.length << 1];
			for(int i = 0; i < queue.length; i++)
				newqueue[i] = queue[i];
			queue = newqueue;
			queue[++rear] = data;
		}
		
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
