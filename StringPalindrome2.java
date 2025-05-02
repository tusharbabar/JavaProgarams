/*Q3. Java String program to check whether a string is a Palindrome

Input: str = “aba”

Output: yes

Explanation: Palindrome is String which can be read same both forth and reverse side or can be said String whose orignal 
string is same as reverse of String.
                         "AbbA" , "DaD" , etc these are some examples of Palindrom String.  
*/
import java.util.*;
public class StringPalindrome2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		
		int end=s.length()-1;
		int mid=s.length()/2;
		boolean flag=true;
		for(int i=0;i<mid;i++)
		{
			char ch1=s.charAt(i);
			char ch2=s.charAt(end);
			end--;
			if(ch1!=ch2)
			{
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("Palindrome");
		else
			System.out.println("not Palindrome");
	}
}
