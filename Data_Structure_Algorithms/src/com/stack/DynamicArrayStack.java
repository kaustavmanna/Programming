/**
 * @author kaustavmanna
 *
 */

package com.stack;

public class DynamicArrayStack
{
	private Integer stack[];
	private int top;
	
	public DynamicArrayStack(int capacity)
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
		{
			Integer newstack[] = new Integer[stack.length<<1];
			
			for(int i = 0; i < stack.length; i++)
				newstack[i] = stack[i];
			stack = newstack;
			stack[++top] = data;
		}
		else
			stack[++top] = data;
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
		if (top == -1)
			return true;
		else
			return false;
	}
}
