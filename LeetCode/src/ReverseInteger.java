/*
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:
Input: 123
Output: 321

Example 2:
Input: -123
Output: -321

Example 3:
Input: 120
Output: 21

Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1].
For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
*/

public class ReverseInteger
{
    public static void main(String[] args)
    {
        int x = 1234;
        System.out.println("Reverse of the number " + x + " is: " + findreversenumber(x));
    }
    public static int findreversenumber(int x)
    {
        int reverse = 0;
        while(x != 0)
        {
            if(reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && (x % 10) > 7))
                return 0;
            else if(reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && (x % 10) < -8))
                return 0;
            reverse = reverse * 10 + (x % 10);
            x = x / 10;
        }
        return reverse;
    }
}
