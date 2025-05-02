
    
import java.util.Scanner;
public class CharcaterVoewlConsoCountApp
{
    public static void main(String[] args)
   {
        Scanner scanner = new Scanner(System.in);
        
        // Input string from user
        System.out.print("Enter the string: ");
        String input = scanner.nextLine().toLowerCase(); // Convert to lowercase for easy comparison
        
        int vowels = 0, consonants = 0, specialChars = 0;
        for (char ch : input.toCharArray())
           {
            if (Character.isLetter(ch))
            { 
                  if ("aeiou".indexOf(ch) != -1)
                {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (!Character.isDigit(ch) && !Character.isWhitespace(ch))
            { 
                specialChars++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Special Characters: " + specialChars);
    }
}
