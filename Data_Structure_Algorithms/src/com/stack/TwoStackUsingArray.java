package com.stack;

import com.stack.Stack;

public class TwoStackUsingArray
{
    private Integer arr[];
    private int stack1_pos;
    private int stack2_pos;

    public TwoStackUsingArray(int arrsize)
    {
        arr = new Integer[arrsize];
        stack1_pos = -1;
        stack2_pos = arrsize;
    }

    public Integer peek(int stackid)
    {
        if(stackid == 1 && stack1_pos >= 0)
            return arr[stack1_pos];
        else if(stackid == 2 && stack2_pos <= arr.length)
            return arr[stack2_pos];
        else
            return null;
    }

    public void push(int stackid, Integer data)
    {
        if((stack1_pos + 1) == stack2_pos)
            System.out.println("Stack is Full!");
        else
        {
            if(stackid == 1)
            {
                stack1_pos++;
                arr[stack1_pos] = data;
            }
            else
            {
                stack2_pos--;
                arr[stack2_pos] = data;
            }
        }
    }

    public Integer pop(int stackid)
    {
        if((stackid == 1 && stack1_pos == -1) || (stackid == 2 && stack2_pos == arr.length))
            return null;
        else
        {
            if(stackid == 1)
                return arr[stack1_pos--];
            else
                return arr[stack2_pos++];
        }
    }

    public boolean isEmpty(int stackid)
    {
        if(stackid == 1 && stack1_pos == -1)
            return true;
        else if(stackid == 2 && stack2_pos == arr.length)
            return true;
        else
            return false;
    }

    public int size(int stackid)
    {
        if(stackid == 1)
            return (stack1_pos + 1);
        else
            return (arr.length - stack2_pos);
    }
}