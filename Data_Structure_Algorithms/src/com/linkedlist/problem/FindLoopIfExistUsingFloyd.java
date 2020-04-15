package com.linkedlist.problem;

import com.linkedlist.SingleLinkedList;
import com.linkedlist.SingleListNode;

public class FindLoopIfExistUsingFloyd<E> extends SingleLinkedList<E>
{
    public boolean findloop()
    {
        SingleListNode<E> slowptr = super.head;
        SingleListNode<E> fastptr = super.head;

        while(slowptr != null && fastptr != null && fastptr.getNext() != null)
        {
            slowptr = slowptr.getNext();
            fastptr = fastptr.getNext().getNext();

            if (slowptr == fastptr)
                return true;
        }
        return false;
    }

    public SingleListNode<E> findloopposition()
    {
        SingleListNode<E> slowptr = super.head;
        SingleListNode<E> fastptr = super.head;
        boolean found = false;

        while(slowptr != null && fastptr != null && fastptr.getNext() != null)
        {
            slowptr = slowptr.getNext();
            fastptr = fastptr.getNext().getNext();

            if(slowptr == fastptr)
            {
                found = true;
                break;
            }
        }

        if(found == true)
        {
            slowptr = head;
            while(slowptr != fastptr)
            {
                slowptr = slowptr.getNext();
                fastptr = fastptr.getNext();
            }
            return slowptr;
        }
        return null;
    }
}
