/**
 * @author kaustavmanna
 *
 */

package com.linkedlist;

public class CircularSingleLinkedList<E>
{
	protected SingleListNode<E> head;
	
	public CircularSingleLinkedList()
	{
		head = null;
	}
	
	public void deletelist()
	{
		head = null;
		System.out.println("The list is deleted!");
	}
	
	public int size()
	{
		int count = 0;
		if(head != null)
		{
			SingleListNode<E> N = head;
			count = 1;
			while(N.getNext() != head)
			{
				count++;
				N = N.getNext();
			}
		}
		return count;
	}
	
	public void traverse()
	{
		if(head == null)
			System.out.println("List is Empty!");
		else
		{
			System.out.println("Current elements in the list are: ");
			SingleListNode<E> N = head;
			do
			{
				System.out.print(N.getData() + " ");
				N = N.getNext();
			}while(N != head);
			System.out.println("");
		}
	}
	
	public void insertNode(E data)
	{
		SingleListNode<E> newnode = new SingleListNode<E>(data);
		
		if(head == null)
		{
			head = newnode;
			head.setNext(head);
		}
		else
		{
			SingleListNode<E> N = head;
			while(N.getNext() != head)
				N = N.getNext();
			N.setNext(newnode);
			newnode.setNext(head);
		}
		System.out.println(data + " is added to the list!");
	}
	
	public void deleteNode(E data)
	{
		if(head == null)
		{
			System.out.println("The list is empty!");
			return;
		}
		
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
			SingleListNode<E> curr = head.getNext();
			SingleListNode<E> prev = head;
			
			do
			{
				if(curr.getData() == data)
				{
					prev.setNext(curr.getNext());
					curr.setNext(null);
					
					if(curr == head)
						head = prev.getNext();
					
					System.out.println(data + " is deleted from the list!");
					return;
				}
				prev = curr;
				curr = curr.getNext();
			}while(prev != head);
		}
		System.out.println(data + " does not exist in the list!");
	}
}
