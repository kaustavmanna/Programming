package com.linkedlist;

public class LinkedListImpl
{
	public static void main(String[] args)
	{
		CircularSingleLinkedList<Integer> list1 = new CircularSingleLinkedList<Integer>();
		
		list1.insertNode(1);
		//list1.insertNode(3);
		//list1.insertNode(5);
		
		list1.traverse();
		
		list1.deleteNode(1);
		//list1.insertNode(7);
		
		list1.traverse();
	}
}
