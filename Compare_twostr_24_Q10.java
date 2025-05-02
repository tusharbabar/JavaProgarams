/*Q10. Java String Program to Compare Two Strings
*/
import java.util.*;
public class Compare_twostr_24_Q10
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string");
		String s1=sc.nextLine();
		System.out.println("Enter second string");
		String s2=sc.nextLine();
		
		if(s1.equals(s2))
			System.out.println("Equal");
		else
			System.out.println("not Equal");
	}
}