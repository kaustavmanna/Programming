/**
 * @author kaustavmanna
 *
 */

package com.queue;

public class QueueImpl
{
	public static void main(String[] args)
	{
		Queue<Integer> q = new LinkedListQueue<Integer> ();
		q.enQueue(5);
		q.enQueue(14);
		q.enQueue(15);
		q.enQueue(20);
		//q.enQueue(25);
		System.out.println("Deleted: " + q.deQueue());
		System.out.println("Deleted: " + q.deQueue());
		System.out.println("Deleted: " + q.deQueue());
		System.out.println("Deleted: " + q.deQueue());
		System.out.println("Deleted: " + q.deQueue());
	}
}
