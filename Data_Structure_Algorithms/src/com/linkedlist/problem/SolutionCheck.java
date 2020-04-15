package com.linkedlist.problem;

import com.linkedlist.SingleLinkedList;
import com.linkedlist.SingleListNode;

public class SolutionCheck
{
    public static void main(String args[])
    {
        //Scanner in = new Scanner(System.in);
        //System.out.print("Enter a number: ");
        //int k = in.nextInt();

        ReverseLinkedList<Integer> linkedList = new ReverseLinkedList<>();
        linkedList.insertNode(10);
        linkedList.insertNode(15);
        linkedList.insertNode(5);
        linkedList.insertNode(20);
        linkedList.insertNode(30);
        linkedList.insertNode(25);
        linkedList.insertNode(26);
        linkedList.insertNode(16);
        linkedList.insertNode(35);

        System.out.println("Before Reversing:");
        linkedList.traverse();

        System.out.println("Iterative Reversal:");
        linkedList.reverseIterative();
        linkedList.traverse();

        System.out.println("Recursive Reversal:");
        linkedList.reverseRecursive();
        linkedList.traverse();
    }
}
