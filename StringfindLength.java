/*
. Find the Length of a String
Description: Find the length of a given string.
Input: "hello"
Output: 5
*/
import java.util.*;
public class StringfindLength
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        char[]ch=str.toCharArray();
        int length=0;
        for(char c:ch)
        {
            length++;
        }
        System.out.println("length is : "+length);
        
    }
    
}
