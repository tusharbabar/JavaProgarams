//Q11. Program to Find the Sum of Two Large Numbers.
//Input : str1 = "7777555511111111",
//str2 = "3332222221111"
//Output : 7780887733332222


import java.util.*;
public class FindSumTwoLargeNumber
{	
public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String :"); // First Inpute
		String F=sc.nextLine();
		System.out.println("Enter Second String :"); // Second Inpute
		String S=sc.nextLine();
		
		long S1=Long.parseLong(F);  //String Convert Into Long Intergaer
		long S2=Long.parseLong(S);	//String Convert Into Long Intergaer
		
		System.out.println("ADDITION IS :"+(S1+S2));  //ADDITION 
	}
}