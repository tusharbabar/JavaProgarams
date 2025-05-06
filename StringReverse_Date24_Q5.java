/*Q5.Java String Program to Reverse a String

Input: "abcd"

Output: dcaba
*/
import java.util.*;
public class StringReverse_Date24_Q5
{
   public static void main(String x[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter String:");
      String s=sc.nextLine();
      char ch[]=new char[s.length()-0];
      int k=s.length()-1;
      for(int i=0;i<ch.length;i++)
        {
          ch[i]=s.charAt(k);
          k--;
        }
    s="";
  for(int i=0;i<ch.length;i++)
    s+=ch[i];
   System.out.println(s);
  }
}
	