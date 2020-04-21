/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:
Input: ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Note: All given inputs are in lowercase letters a-z.
 */

public class LongestCommonPrefix
{
    public static void main(String[] args)
    {
        String[] s = new String[]{"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(s));
    }

    public static String longestCommonPrefix(String[] strs)
    {
        String common = "";
        boolean matching = true;
        int index = 0;

        if(strs.length == 0)
            return common;

        while(matching)
        {
            if(index == strs[0].length())
                break;
            char c = strs[0].charAt(index);
            for(int i = 1; i < strs.length; i++)
            {
                if(index == strs[i].length() || c != strs[i].charAt(index))
                {
                    matching = false;
                    break;
                }
            }

            if(matching == true)
            {
                common = common + c;
                index++;
            }
        }
        return strs[0].substring(0,index);
    }
}
