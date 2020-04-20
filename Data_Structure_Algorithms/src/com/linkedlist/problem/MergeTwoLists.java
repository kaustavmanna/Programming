package com.linkedlist.problem;

import com.linkedlist.SingleListNode;

public class MergeTwoLists
{
    public static SingleListNode<Integer> mergelists(SingleListNode<Integer> node1, SingleListNode<Integer> node2)
    {
        SingleListNode<Integer> head = null;
        SingleListNode<Integer> trav = null;
        if(node1 == null)
            return node2;
        else if(node2 == null)
            return node1;

        if(node1.getData() < node2.getData())
        {
            head = node1;
            node1 = node1.getNext();
        }
        else
        {
            head = node2;
            node2 = node2.getNext();
        }

        trav = head;

        while(node1 != null || node2 != null)
        {
            if(node1.getData() < node2.getData())
            {
                trav.setNext(node1);
                trav = trav.getNext();
                node1 = node1.getNext();
            }
            else
            {
                trav.setNext(node2);
                trav = trav.getNext();
                node2 = node2.getNext();
            }
        }

        while(node1 != null)
        {
            trav.setNext(node1);
            trav = trav.getNext();
            node1 = node1.getNext();
        }

        while(node2 != null)
        {
            trav.setNext(node2);
            trav = trav.getNext();
            node2 = node2.getNext();
        }
        return head;
    }
}
