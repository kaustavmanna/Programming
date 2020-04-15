/*Problem Statement - Find the middle of the linked list*/

package com.linkedlist.problem;

import com.linkedlist.SingleLinkedList;
import com.linkedlist.SingleListNode;

public class FindMiddle<E> extends SingleLinkedList<E>
{
    public SingleListNode<E> findmiddle()
    {
        SingleListNode<E> middle = super.head;
        SingleListNode<E> trav = super.head;

        while (trav != null && trav.getNext() != null && trav.getNext().getNext() != null)
        {
            trav = trav.getNext().getNext();
            middle = middle.getNext();
        }
        return middle;
    }
}
