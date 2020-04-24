/*
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word (last word means the last appearing word if we loop from left to right) in the string.
If the last word does not exist, return 0.
Note: A word is defined as a maximal substring consisting of non-space characters only.

Example:
Input: "Hello World"
Output: 5
*/

public class LengthOfLastWord
{
    public static void main(String[] args)
    {
        String s = "Kaustav Manna ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s)
    {
        int length = 0;
        boolean found = false;

        for(int i = s.length() - 1; i >=0 ; i--)
        {
            if(s.charAt(i) == ' ' && found)
                return length;
            else if(s.charAt(i) != ' ')
            {
                length++;
                found = true;
            }
        }
        return length;
    }
}
