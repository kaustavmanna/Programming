/**
 * @author kaustavmanna
 *
 */

package com.stack;

public class FixedArrayStack
{
	private Integer stack[];
	private int top;
	
	public FixedArrayStack(int capacity)
	{
		stack = new Integer[capacity];
		top = -1;
	}
	
	public Integer peek()
	{
		if(top != -1)		
			return stack[top];
		else
		{
			System.out.println("Empty Stack");
			return null;
		}
	}
	
	public void push(Integer data)
	{
		if(top == (stack.length - 1))
			System.out.println("Stack Overflow");
		else
		{
			stack[++top] = data;
			System.out.println(data + " Sucessfully pushed.");
		}
	}
	
	public Integer pop()
	{
		if(top != -1)
		{
			top--;
			return(stack[top + 1]);
		}
		else
		{
			System.out.println("Empty Stack");
			return null;
		}
	}
	
	public boolean isEmpty()
	{
		if(top == -1)
			return true;
		else
			return false;
	}
}
