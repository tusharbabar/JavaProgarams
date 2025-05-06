public class MissingSmallArray
{
public static void main(String x[])
{
int a[]={1,2,4,5};
int sum=0;
for(int i=0;i<a.length;i++)
{
  sum=sum+a[i];
}
System.out.println("sum of :"+sum);
int sum2=0;
for(int i=1;i<=5;i++)
{
sum2=sum2+i;
//System.out.println("sum of range:"+sum2);
System.out.println("Missing number is :"+(sum2-sum));
}
}
}