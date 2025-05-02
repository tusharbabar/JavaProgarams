/*Q1. Java program to print Even length words in a String?

Input: s = "This is a java language"

Output: This is  java language

Explanation: All the elements with the length even are printed. 
                        "This" length is 4 so printed whereas "a" length is 1 so not Printed.  
*/
import java.util.*;
public class EvenLength_Word_str
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		s+=" ";
		
		char ch[]=new char[s.length()];
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=s.charAt(i);
		}
		s="";
		String word="";
		for(int i=0;i<ch.length;i++)
		{
			
			if(ch[i]!=32)
			{
				word+=ch[i];
			}
			else 
			{
				if(word.length()%2==0)
				{
					s+=word+" ";
					
				}
				word="";
			}
		}
		System.out.println(s);
	}
}