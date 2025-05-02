/*Q6. Java String Program to Swapping Pair of Characters

Input: str = “GIRITECHHUB”

Output: IGIRETHCUHB
*/
import java.util.*;
public class Swap_two_str_24_Q6
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		
		char ch[]=new char[s.length()];
		for(int i=0;i<ch.length;i++)
			ch[i]=s.charAt(i);
		
		for(int i=0;i<ch.length-1;i+=2)
		{
			char temp=ch[i];
			ch[i]=ch[i+1];
			ch[i+1]=temp;
		}
		s="";
		for(int i=0;i<ch.length;i++)
			s+=ch[i];
		System.out.println(s);
	}
}