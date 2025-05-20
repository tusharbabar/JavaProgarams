/*Replace All Occurrences of a Character in String
Input: "hello", o -> x
Output: "hellx"
*/

import java.util.*;
public class ReplacecharString
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        String str="hello";
        char target='o';
        char replace='x';
        
        char[]ch=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]==target)
            {
                ch[i]=replace;
            }
        }
        String output=new String(ch);
        System.out.println(output);
    }
}
