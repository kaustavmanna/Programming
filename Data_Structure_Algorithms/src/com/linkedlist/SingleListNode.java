/**
 * @author kaustavmanna
 *
 */

package com.linkedlist;

public class SingleListNode<E>
{
	private E value;
	private SingleListNode<E> next;
	
	public SingleListNode(E value)
	{
		this.value = value;
		next = null;
	}
	
	public E getData()
	{
		return this.value;
	}
	
	public SingleListNode<E> getNext()
	{
		return this.next;
	}
	
	public void setNext(SingleListNode<E> next)
	{
		this.next = next;
	}
}
