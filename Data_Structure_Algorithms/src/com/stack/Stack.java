/**
 * 
 */
package com.stack;

/**
 * @author kaustavmanna
 *
 */
public interface Stack<E>
{
	public E peek();
	public void push(E data);
	public E pop();
	public boolean isEmpty();
	public int size();
}
