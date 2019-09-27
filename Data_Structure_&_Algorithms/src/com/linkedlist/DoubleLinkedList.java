package com.linkedlist;

public class DoubleLinkedList
{
	DoubleListNode head;

	public DoubleLinkedList()
	{
		this.head = null;
	}
	
	public void traverse()
	{
		if(head == null)
			System.out.println("The List is Empty.");
		else
		{
			System.out.println("The Current List is: ");
			for(DoubleListNode N = head; N != null; N = N.getNext())
				System.out.print(N.getData() + " ");
			System.out.println();
		}
	}
	
	public void insert(int data)
	{
		DoubleListNode newnode = new DoubleListNode(data);
		DoubleListNode N = head;
		if(head == null)
			head = newnode;
		else
		{
			while(N.getNext() != null)
				N = N.getNext();
		
			N.setNext(newnode);
			newnode.setPrevious(N);
		}
	}
}
