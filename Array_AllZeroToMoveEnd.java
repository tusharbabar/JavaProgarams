import java.util.*;
public class Array_AllZeroToMoveEnd
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element:");
        int a[]=new int[6];
    
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
      int j=0;
      for(int i=1;i<a.length;i++) 
      {
          if(a[i] !=0)
          {
              int temp=a[i];
              a[i]=a[j];
              a[j]=temp;
              j++;
            }
      }
      for(int i=0;i<a.length;i++)
      {
          System.out.printf(" "+a[i]);
      }
    }
}