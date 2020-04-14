/*Problem Statement - Print linked list in the reverse order*/

package com.linkedlist.problem;

import com.linkedlist.SingleLinkedList;
import com.linkedlist.SingleListNode;

public class Problem3<E> extends SingleLinkedList<E>
{
    public void reversetraverse()
    {
        SingleListNode<E> trav = super.head;
        reversetraverse(trav);
    }

    private void reversetraverse(SingleListNode<E> trav)
    {
        if(trav == null)
            return;
        reversetraverse(trav.getNext());
        System.out.print(trav.getData() + " ");
    }
}
