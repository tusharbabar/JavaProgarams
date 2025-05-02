import java.util.*;
public class LowerCaseToUpperCAse
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String str=sc.nextLine();
        System.out.println("before conversion :" + str);
        String str2=str.toUpperCase();
        System.out.println("Aftr conversion :" + str2);
    }
}