package com.linkedlist.problem;

import com.linkedlist.CircularSingleLinkedList;
import com.linkedlist.SingleListNode;

public class SplitCircularLinkedList<E> extends CircularSingleLinkedList<E>
{
    public SingleListNode<E> splitlist()
    {
        if(super.head == null || super.head.getNext() == super.head)
            return null;

        SingleListNode<E> fastptr = super.head;
        SingleListNode<E> slowptr = super.head;

        while(fastptr.getNext() != super.head && fastptr.getNext().getNext() != super.head)
        {
            fastptr = fastptr.getNext().getNext();
            slowptr = slowptr.getNext();
        }

        if(fastptr.getNext().getNext() == head)
            fastptr = fastptr.getNext();

        SingleListNode<E> head2 = slowptr.getNext();
        slowptr.setNext(super.head);
        fastptr.setNext(head2);
        return head2;
    }
}
