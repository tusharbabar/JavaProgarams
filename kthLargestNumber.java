//8. Write a java program to find kth highest number from array. //

// Write a java program to find kth highest number from array.

import java.util.*;
public class kthLargestNumber
{
	public static void main(String x[])
	{	int a[]=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Array :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	
		for(int i=0;i<a.length;i++){
		}
			System.out.println("kth number:"+a[a.length-2]);
	}
}