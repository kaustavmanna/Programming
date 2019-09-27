package com.queue;

public class DynamicCircularArrayQueue
{
	int front, rear;
	int queue[];
	
	public DynamicCircularArrayQueue(int capacity)
	{
		queue = new int[capacity];
		front = 0;
		rear = 0;
	}
	
	public void enQueue(int data)
	{
		if((rear == queue.length - 1 && front == 0) || (rear + 1) == front)
		{
			int newqueue[] = new int[queue.length << 1];
			//System.arraycopy(queue, 0, newqueue, 0, queue.length);
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
	
	public int deQueue()
	{
		if(isEmptyQueue())
		{
			System.out.println("Empty Queue");
			return -1;
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
	
	public int front()
	{
		if(isEmptyQueue())
		{
			System.out.println("Empty Queue");
			return -1;
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
