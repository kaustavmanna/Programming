package Queue;

public class QueueImpl
{
	public static void main(String[] args)
	{
		LinkedListQueue<Integer> q = new LinkedListQueue<Integer> ();
		q.enQueue(5);
		q.enQueue(10);
		q.enQueue(15);
		q.enQueue(20);
		q.enQueue(25);
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
	}
}
