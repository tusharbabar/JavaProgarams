/*Q2. Write a java program to print this pattern.
A B C D E F
A B C D E
A B C D
A B C
A B
A
*/


import java.util.*;
class patten2
{
	public static void main(String x[])
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of row");
	int r=sc.nextInt();// taking row input
	for(int i=1; i<=r; i++)
   {
		char c='A';
		for(int j=1; j<=r*2-1; j++)
        {
			if(j>=i && j<=r*2-i && i%2!=0 && j%2!=0)// if i and j both are odd it will print char
			{
				System.out.print(c);
				c++;
			}
			else if(j>=i && j<=r*2-i && i%2==0 && j%2==0)// if i and j both are odd it will print char
			{
				System.out.print(c);
				c++;
			}
			else{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	}
}