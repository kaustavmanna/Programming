package com.linkedlist.problem;

import java.util.Scanner;

public class SolutionCheck
{
    public static void main(String args[])
    {
        //Scanner in = new Scanner(System.in);
        //System.out.print("Enter a number: ");
        //int k = in.nextInt();

        Problem3<Integer> linkedList = new Problem3<Integer>();
        linkedList.insertNode(10);
        linkedList.insertNode(15);
        linkedList.insertNode(5);
        linkedList.insertNode(20);
        linkedList.insertNode(30);
        linkedList.insertNode(25);
        linkedList.insertNode(26);
        linkedList.insertNode(16);
        linkedList.insertNode(35);

        linkedList.reversetraverse();
    }
}
