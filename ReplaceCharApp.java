	
import java.util.*;
public class ReplaceCharApp
{
    public static void main(String[] args) 
    {
       // String str="JAVA IS FOOD Programing";  OUTPUT:JAVA IS GOOD Programing
       Scanner sc=new Scanner(System.in);
       System.out.println("enter String:");
       String str=sc.nextLine();
       int index=8;
       char ch='G';
       String result=replacecharAt(str,index,ch);
       System.out.println("Output:"+result);
        
    }
     public static String replacecharAt(String str,int index,char ch)
    {
     if(index<0||index>=str.length())
       {
           return "invalid index";
       }
       return str.substring(0,index)+ ch + str.substring(index+1);
    }
}