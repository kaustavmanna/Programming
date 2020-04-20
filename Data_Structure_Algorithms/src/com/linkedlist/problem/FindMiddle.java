/*Problem Statement - Find the middle of the linked list*/

package com.linkedlist.problem;

import com.linkedlist.SingleListNode;

public class FindMiddle<E>
{
    public SingleListNode<E> findmiddle(SingleListNode<E> head)
    {
        SingleListNode<E> middle = head;
        SingleListNode<E> trav = head;

        while (trav != null && trav.getNext() != null && trav.getNext().getNext() != null)
        {
            trav = trav.getNext().getNext();
            middle = middle.getNext();
        }
        return middle;
    }
}
