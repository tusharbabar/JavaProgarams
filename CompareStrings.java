
//Java String Program to Compare Two Strings

import java.util.Scanner;

public class CompareStrings 
{
    public static void main(String[] args) 

{
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        
        // Compare using equals method
        if (str1.equals(str2))
   {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
        
        int compare = str1.compareTo(str2);
        if (compare < 0)
       {
            System.out.println("The first string is less than the second string.");
        } else if (compare > 0)
        {
            System.out.println("The first string is greater than the second string.");
        } else {
            System.out.println("Both strings are equal.");
        }

    }
}