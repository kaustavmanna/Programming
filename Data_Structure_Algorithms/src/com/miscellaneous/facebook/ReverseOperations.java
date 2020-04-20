/* You are given a singly-linked list that contains N integers.
   A subpart of the list is a contiguous set of even elements, bordered either by the end of the list or an odd element.
   For example, if the list is [1, 2, 8, 9, 12, 16], the subparts of the list are [2, 8] and [12, 16].
   Then, for each subpart, the order of the elements is reversed.
   In the example, this would result in the new list, [1, 8, 2, 9, 16, 12].
   The goal of this question is: given a resulting list, determine the original order of the elements.

   Implementation detail:
   You must use the following definition for elements in the linked list:
        class Node
        {
            int data;
            Node next;
        }

   Signature
   Node reverse(Node head)
   Constraints
   1 <= N <= 1000, where N is the size of the list
   1 <= Li <= 10^9, where Li is the ith element of the list
*/

package com.miscellaneous.facebook;

import java.util.Scanner;
import java.util.Stack;

public class ReverseOperations
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Stack<Node> stack = new Stack<Node>();
        Node head = null;
        Node trav = null;

        for(int i = 0; i < n; i++)
        {
            int input = in.nextInt();
            if(input % 2 == 0)
                stack.push(new Node(input));
            else
            {
                while(!stack.isEmpty())
                {
                    if(head == null)
                    {
                        head = stack.pop();
                        trav = head;
                    }
                    else
                    {
                        trav.setNext(stack.pop());
                        trav = trav.getNext();
                    }
                }
                if(head == null)
                {
                    head = new Node(input);
                    trav = head;
                }
                else
                {
                    trav.setNext(new Node(input));
                    trav = trav.getNext();
                }
            }
        }

        while(!stack.isEmpty())
        {
            if(head == null)
            {
                head = stack.pop();
                trav = head;
            }
            else
            {
                trav.setNext(stack.pop());
                trav = trav.getNext();
            }
        }

        trav = head;
        while(trav != null)
        {
            System.out.print(trav.getData() + " ");
            trav = trav.getNext();
        }
    }
}

class Node
{
    private int data;
    private Node next;

    public Node(int data)
    {
        this.data = data;
        next = null;
    }

    public int getData()
    {
        return this.data;
    }

    public Node getNext()
    {
        return this.next;
    }

    public void setNext(Node next)
    {
        this.next = next;
    }
}
