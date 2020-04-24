/*
Implement strStr().
Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:
Input: haystack = "hello", needle = "ll"
Output: 2

Example 2:
Input: haystack = "aaaaa", needle = "bba"
Output: -1

Clarification:
What should we return when needle is an empty string? This is a great question to ask during an interview.
For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
*/

public class NeedleInHaystack
{
    public static void main(String[] args)
    {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle)
    {
        if(needle.equals(""))
            return 0;

        int haystack_length = haystack.length();
        int needle_length = needle.length();

        for(int i = 0; i <= (haystack_length - needle_length); i++)
        {
            String sub = haystack.substring(i, i + needle_length);
            if(sub.equals(needle))
                return i;
        }
        return -1;
    }
}
