/*
Given two binary strings, return their sum (also a binary string).
The input strings are both non-empty and contains only characters 1 or 0.

Example 1:
Input: a = "11", b = "1"
Output: "100"

Example 2:
Input: a = "1010", b = "1011"
Output: "10101"

Constraints:
Each string consists only of '0' or '1' characters.
1 <= a.length, b.length <= 10^4
Each string is either "0" or doesn't contain any leading zero.
*/

public class AddBinary
{
    public static void main(String[] args)
    {
        String a = "1001";
        String b = "1010";
        System.out.println(addBinary(a, b));
    }
    public static String addBinary(String a, String b)
    {
        int a_index = a.length() - 1;
        int b_index = b.length() - 1;

        String result = "";
        int digit_1 = 0;
        int digit_2 = 0;
        int cf = 0;

        while(a_index >= 0 || b_index >= 0)
        {
            if(a_index >= 0)
                digit_1 = a.charAt(a_index--) - '0';
            else
                digit_1 = 0;

            if(b_index >= 0)
                digit_2 = b.charAt(b_index--) - '0';
            else
                digit_2 = 0;

            int sum = digit_1 + digit_2 + cf;
            cf = sum / 2;
            result = sum % 2 + result;
        }
        if(cf == 1)
            return (cf + result);
        else
            return result;
    }
}
