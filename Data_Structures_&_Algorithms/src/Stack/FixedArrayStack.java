package Stack;

public class FixedArrayStack
{
	int stack[];
	int top;
	
	public FixedArrayStack(int capacity)
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
			System.out.println("Stack Overflow");
		else
		{
			stack[++top] = data;
			System.out.println(data + " Sucessfully pushed.");
		}
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
		if(top == -1)
			return true;
		else
			return false;
	}
}
