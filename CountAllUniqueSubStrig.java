//Q12. Write a Java program to count all unique substrings of a given string.
//Example:
//Input: "abc"
//Output: 6 (The substrings are: "a", "b", "c", "ab", "bc", "abc")
//Explanation:
//You need to generate all possible substrings and 


import java.util.*;
public class CountAllUniqueSubStrig
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		int ar[]=new int[7];
		System.out.println("Enter the Array Elements");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					ar[j]=0;
					count++;
					for(int k=j;k<ar.length-1;k++)
					{
					
						int temp=ar[k];
						ar[k]=ar[k+1];
						ar[k+1]=temp;	
					}
				}
			}
		}
		for(int i=0; i<=ar.length-count; i++)
		{
			System.out.print(ar[i]+"");
		}
	}
}