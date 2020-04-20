/*
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order and each of their nodes contain a single digit.
Add the two numbers and return it as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.

Definition for singly-linked list.
public class ListNode
{
    int val;
    ListNode next;
    ListNode(int x)
    {
        val = x;
    }
}
*/

class ListNode
{
    int val;
    ListNode next;
    ListNode (int x)
    {
        val = x;
    }
}

public class AddTwoNumbers
{
    public static void main(String[] args)
    {
        /*Initializing First List*/
        ListNode trav;
        ListNode l1 = new ListNode(2);
        trav = l1;
        trav.next = new ListNode(4);
        trav = trav.next;
        trav.next = new ListNode(3);
        trav = trav.next;

        /*Initializing Second List*/
        ListNode l2 = new ListNode(5);
        trav = l2;
        trav.next = new ListNode(6);
        trav = trav.next;
        trav.next = new ListNode(4);
        trav = trav.next;

        trav = addTwoNumbers(l1, l2);
        while(trav != null)
        {
            System.out.print(trav.val + " ");
            trav = trav.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        int cf = 0;
        ListNode result = null;
        ListNode trav = null;

        while(l1 != null && l2 != null)
        {
            int output = (l1.val + l2.val + cf) % 10;
            cf = (l1.val + l2.val + cf) / 10;
            if(result == null)
            {
                result = new ListNode(output);
                trav = result;
            }
            else
            {
                trav.next = new ListNode(output);
                trav = trav.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null)
        {
            trav.next = new ListNode((l1.val + cf) % 10);
            cf = (l1.val + cf) / 10;
            l1 = l1.next;
            trav = trav.next;
        }

        while(l2 != null)
        {
            trav.next = new ListNode((l2.val + cf) % 10);
            cf = (l2.val + cf) / 10;
            l2 = l2.next;
            trav = trav.next;
        }

        if(cf != 0)
            trav.next = new ListNode(cf);

        return result;
    }
}
