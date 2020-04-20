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

        SplitCircularLinkedList<Integer> circularLinkedList = new SplitCircularLinkedList<>();
        circularLinkedList.insertNode(1);
        circularLinkedList.insertNode(2);
        circularLinkedList.insertNode(3);
        circularLinkedList.insertNode(4);
        circularLinkedList.insertNode(5);
        circularLinkedList.insertNode(6);

        circularLinkedList.traverse();

        SingleListNode<Integer> list2 = circularLinkedList.splitlist();

        System.out.println("First List: ");
        circularLinkedList.traverse();

        System.out.println("Second List: ");
        SingleListNode<Integer> trav = list2;
        do
        {
            System.out.print(trav.getData() + " ");
            trav = trav.getNext();
        }while(trav != list2);
    }
}
