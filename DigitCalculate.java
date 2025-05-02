/*

Q1. WAP to input string and extract digit from it and calculate its addition?
Input: abc123mno456pqr
Output: 1+2+3+4+5+6 = 21

*/

import java.util.*;
public class DigitCalculate
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("enter Digit and char");
		String str=sc.nextLine();
		int sum=0;
		
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			if(ch>=48 && ch<=57)
			{
				int a=(int)ch-48;
				sum=sum+a;
			}
		}
		System.out.println("Sum of Digit is String is:" +sum);
	}
}