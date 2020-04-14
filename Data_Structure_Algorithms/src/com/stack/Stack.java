/**
 * @author kaustavmanna
 *
 */

package com.stack;

public interface Stack<E>
{
	E peek();
	void push(E data);
	E pop();
	boolean isEmpty();
	int size();
}
