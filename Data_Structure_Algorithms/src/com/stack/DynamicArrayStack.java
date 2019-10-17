package com.stack;

public class DynamicArrayStack
{
	int stack[];
	int top;
	
	public DynamicArrayStack(int capacity)
	{
		stack = new int[capacity];
		top = -1;
	}
	
	public int peek()
	{
		if(top != -1)		
			return stack[top];
		else
		{
			System.out.println("Empty Stack");
			return -1;
		}
	}
	
	public void push(int data)
	{
		if(top == (stack.length - 1))
		{
			int newstack[] = new int[stack.length<<1];
			//System.arraycopy(stack, 0, newstack, 0, stack.length);
			for(int i = 0; i < stack.length; i++)
				newstack[i] = stack[i];
			stack = newstack;
			stack[++top] = data;
		}
		else
			stack[++top] = data;
	}
	
	public int pop()
	{
		if(top != -1)
		{
			top--;
			return(stack[top + 1]);
		}
		else
		{
			System.out.println("Empty Stack");
			return -1;
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
