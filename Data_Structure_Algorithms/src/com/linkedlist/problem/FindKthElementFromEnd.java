/*Problem Statement - Find K-th element from the end of a linked list*/

package com.linkedlist.problem;

import com.linkedlist.SingleLinkedList;
import com.linkedlist.SingleListNode;

import java.util.LinkedList;

public class FindKthElementFromEnd<E> extends SingleLinkedList<E>
{
    public E findkthelementfromend(int k)
    {
        int count = 0;
        SingleListNode<E> start = super.head;
        SingleListNode<E> end = super.head;

        while(end != null && count != k-1)
        {
            count++;
            end = end.getNext();
        }

        if(end == null)
            return null;
        else
        {
            while(end.getNext() != null)
            {
                start = start.getNext();
                end = end.getNext();
            }
            return start.getData();
        }
    }
}
