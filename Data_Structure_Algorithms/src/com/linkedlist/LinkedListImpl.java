/**
 * @author kaustavmanna
 *
 */

package com.linkedlist;

public class LinkedListImpl
{
	public static void main(String[] args)
	{
		SingleLinkedListArray list = new SingleLinkedListArray();
		
		list.insertNode(1);
		list.insertNode(3);
		list.insertNode(5);
		list.insertNode(7);
		
		list.traverse();
	}
}
