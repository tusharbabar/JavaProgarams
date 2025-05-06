import java.util.*;
public class ArrayDeleteDuplicateDigit
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element:");
        int a[]=new int[7];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
      //int[]a={21,35,35,47,47,56,68};
      int j=0;
      for(int i=1;i<a.length;i++) 
      {
          if(a[i] != a[j])
          {
              j++;
              int temp=a[j];
              a[j]=a[i];
              a[i]=temp;
              
          }
      }
      for(int i=0;i<=j;i++)
      {
          System.out.printf(" "+a[i]);
      }
    }
}