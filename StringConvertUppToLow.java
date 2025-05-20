/*26. Convert String to Uppercase
Description: Convert a string to uppercase.
Input: "hello"
Output: "HELLO"
*/
import java.util.*;
public class ConvertUppToLow
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        char[]ch=str.toCharArray();
        
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>='a' && ch[i]<='z')
            {
                ch[i]=(char)(ch[i]-('a'-'A'));
            }
        }
        String output=new String(ch);
        System.out.println("uppecese:"+output);
    }
    
}
