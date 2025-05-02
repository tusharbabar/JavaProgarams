import java.util.*;
public class InserElementString
{
    public static void main(String x[])
   {
       StringBuffer sb=new StringBuffer("Good India");
        System.out.println("Before inderting value: "+sb);
         sb.insert(5,"morning ");
         System.out.println("After " +sb);
   }
}