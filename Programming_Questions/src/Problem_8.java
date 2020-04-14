/*Problem Statement - divide a number in two numbers without the digit 4 and sum of the number will be same as first number*/

import java.util.*;

public class Problem_8
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i <= n; i++)
        {
            int digit = in.nextInt();
            int digit1 = 0, digit2 = 0;
            int decimal = 1;

            while(digit != 0)
            {
                int reminder = digit % 10;
                if(reminder == 4)
                {
                    digit1 += 2 * decimal;
                    digit2 += 2 * decimal;
                }
                else
                    digit1 += reminder * decimal;
                decimal *= 10;
                digit /= 10;
            }
            System.out.println("Case #" + i + ": " + digit1 + " " + digit2);
        }
    }
}