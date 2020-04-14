/*Problem statement - Reverse a stack using only Stack operations*/

package com.stack.problem;

import java.util.Stack;

public class Problem2<E>
{
    public void reversestack(Stack<E> stack)
    {
        if(stack.isEmpty())
            return;
        else
        {
            E data = stack.pop();
            reversestack(stack);
            insertatbottom(stack, data);
        }
    }

    private void insertatbottom(Stack<E> stack, E data)
    {
        if(stack.isEmpty())
            stack.push(data);
        else
        {
            E temp = stack.pop();
            insertatbottom(stack, data);
            stack.push(temp);
        }
    }
}
