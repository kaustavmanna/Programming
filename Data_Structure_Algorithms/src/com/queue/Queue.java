/**
 * @author kaustavmanna
 *
 */

package com.queue;

public interface Queue<E>
{
	public void enQueue(E data);
	public E deQueue();
	public E front();
	public boolean isEmpty();
	public int size();
}