/**
 * @author kaustavmanna
 *
 */

package com.linkedlist;

public class CircularDoubleLinkedList<E>
{
	private DoubleListNode<E> head;
	
	public CircularDoubleLinkedList()
	{
		head = null;
	}
	
	public void deletelist()
	{
		head = null;
	}
	
	public int size()
	{
		int count = 0;
		if(head != null)
		{
			DoubleListNode<E> N = head;
			count++;
			
			while(N.getNext() != head)
			{
				N = N.getNext();
				count++;
			}
		}
		return count;
	}
	
	public void traverse()
	{
		if(head == null)
			System.out.println("List is empty!");
		else
		{
			System.out.println("Current List is: ");
			DoubleListNode<E> N = head;
			do
			{
				System.out.print(N.getData() + " ");
				N = N.getNext();
			}while(N != head);
		}
		System.out.println();
	}
	
	public void insertNode(E data)
	{
		DoubleListNode<E> newnode = new DoubleListNode<E> (data);
		
		if(head == null)
		{
			head = newnode;
			head.setNext(head);
			head.setPrevious(head);
		}
		else
		{
			newnode.setPrevious(head.getPrevious());
			newnode.setNext(head);
			head.getPrevious().setNext(newnode);
			head.setPrevious(newnode);
		}
		System.out.println(data + " is added to the list!");
	}
	
	public void deleteNode(E data)
	{
		if(head == null)
			System.out.println("The list is empty!");
		
		else if(head.getNext() == head)
		{
			if(head.getData() == data)
			{
				head = null;
				System.out.println(data + " is deleted from the list!");
				return;
			}
			System.out.println(data + " does not exist in the list!");
		}
		
		else
		{
			DoubleListNode<E> curr = head;
			
			while(curr.getNext() != head)
			{
				if(curr.getData() == data)
				{
					if(curr == head)
						head = curr.getNext();
					
					curr.getPrevious().setNext(curr.getNext());
					curr.getNext().setPrevious(curr.getPrevious());
					curr.setNext(null);
					curr.setPrevious(null);
					
					System.out.println(data + " is deleted from the list!");
					return;
				}
				curr = curr.getNext();
			}
			System.out.println(data + " does not exist in the list!");
		}
	}
}
