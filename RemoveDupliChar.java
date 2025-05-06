//Remove Duplicate Character from String
  //input:= "hello"
  //output:="helo"
import java.util.*;
public class RemoveDupliChar
{
    public static void main(String x[])
    {
        //Strting str="hello";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String str=sc.nextLine();
        StringBuilder ans=new StringBuilder("");
        int a[]=new int[26];
        for(int i=0;i<str.length();i++)
        {
            int index=str.charAt(i)-97;
            a[index]+=1;
            if(a[index]==1)
            {
                ans.append(str.charAt(i));
            }
        }
        System.out.println("Answer;"+ans);
    }
}