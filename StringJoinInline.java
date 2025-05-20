/*

34. Join an Array of Strings into One String
Description: Join an array of strings into a single string.
Input: ["hello", "world"]
Output: "helloworld"
*/
import java.util.*;
public class StringJoinInline
{
    public static void main(String x[])
    {
        String []a={"hello","world","tushar"};
        String result="";
        for(int i=0;i<a.length;i++)
        {
            result+=a[i];
        }
        System.out.println(result);
    }
}