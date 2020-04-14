/*Problem Statement - Check the balancing of symbols (Parenthesis)*/

package com.stack.problem;

import java.util.Stack;

public class Problem1
{
    public static boolean checkbalancedsymbol(String string)
    {
        Stack<String> stack = new Stack<String>();
        for(int i = 0; i < string.length(); i++)
        {
            String substr = string.substring(i, i+1);
            if(substr.equals("(") || substr.equals("{") || substr.equals("["))
                stack.push(substr);
            else if(substr.equals(")") && !stack.pop().equals("("))
                return false;
            else if(substr.equals("}") && !stack.pop().equals("{"))
                return false;
            else if(substr.equals("]") && !stack.pop().equals("["))
                return false;
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }
}
