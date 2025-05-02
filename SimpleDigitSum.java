import java.util.*;
public class SimpleDigitSum 
{
    public static void main(String x[]) 
   {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int sum = 0;
        for (char ch : input.toCharArray())
        {
            if (Character.isDigit(ch)) 
            {
                sum += ch - '0'; // Convert char to int
            }
        }
        
        System.out.println("Sum of digits: " + sum);
    }
}
	
