import java.util.Scanner;
public class ReverseWords
{
    public static String reverseWords(String str)
   {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words)
        {
            String reversedWord = reverseString(word);
            result.append(reversedWord).append(" ");
        }

        return result.toString().trim(); // Remove trailing space
    }

    public static String reverseString(String word) 
  {
        String reversed = "";
        for (int i = 0; i < word.length(); i++)
       {
            reversed = word.charAt(i) + reversed; 
        }
        return reversed;
    }

    public static void main(String[] args)
   {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        System.out.println(reverseWords(input));
    }
}
