package com.linkedlist.problem;

import com.linkedlist.SingleLinkedList;
import com.linkedlist.SingleListNode;

public class ReverseLinkedList<E> extends SingleLinkedList<E>
{
    public void reverseIterative()
    {
        SingleListNode<E> prev = null;
        SingleListNode<E> next = null;
        SingleListNode<E> current = head;

        while(current != null)
        {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void reverseRecursive()
    {
        reverseRecursive(head);
    }

    private void reverseRecursive(SingleListNode<E> current)
    {
        if(current == null)
            return;
        SingleListNode<E> next = current.getNext();
        if(next == null)
        {
            head = current;
            return;
        }
        reverseRecursive(next);
        next.setNext(current);
        current.setNext(null);
    }
}
