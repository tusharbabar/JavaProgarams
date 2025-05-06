//Q7. Write a java program to find smallest missing number from array.
import java.util.*;
public class FindMissingNumArray
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);	//input Statement
		int a[]=new int[7];		//Declare Array Size
		System.out.println("Enter Array Elements");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(ar[i]>a[j])    //Sorting Array
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		int min=a[a.length-1];
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=a[i]+1;j<a[i+1];j++)
			{
				
			    if(min>j)
		    	{
			    	min=j;
			    }
			
			}
		
		}
		
		System.out.println(" Missing number:"+min);//print statement Smallest Element
	}
}