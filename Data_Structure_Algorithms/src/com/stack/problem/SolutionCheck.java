package com.stack.problem;

import java.util.Stack;

public class SolutionCheck
{
    public static void main(String args[])
    {
        /*Problem 1 check
        String s = "[2*3 + {4+5 - (6/7)}]";
        System.out.println(Problem1.checkbalancedsymbol(s));
        */

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        Problem2<Integer> problem2 = new Problem2<Integer>();
        problem2.reversestack(stack);

        while(!stack.isEmpty())
            System.out.print(stack.pop() + " ");
    }
}
