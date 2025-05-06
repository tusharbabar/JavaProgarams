//Q9. Write a program to remove duplicate characters from a character  array.
//Example:
//Input: ['a', 'b', 'c', 'a', 'd', 'b']
//Output: ['a', 'b', 'c', 'd']

import java.util.*;
public class RemoveDupliCharArray
{
	public static void main(String x[])
	{	
		char ch[]= new char[6];//declare array
		Scanner sc=new Scanner(System.in);//Input Statement
		System.out.println("Enter A String :");
		for(int i=0;i<ch.length;i++)
		{
			ch[i] = sc.next().charAt(0);

		} 
		int count=1;
		{	for(char i=0;i<ch.length;i++)
			{
				for(char j=0;j<ch.length;j++)
				{
					if(ch[i]==ch[j])//Comapre array
					{
						ch[i]=0;
						count++;
						for(char k=j;k<ch.length-1;k++)
						{
							char temp=ch[k];				//Sorted Array
								ch[k]=ch[k+1];
								ch[k+1]=temp;
						}
					}
				}
			}
			for(int i=0; i<=ch.length-count; i++)		//print Out Statement
			{
			System.out.println("Remove Duplicate Char:"+ch);
			}
		}
	}
}