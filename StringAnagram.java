import java.util.*;
 public class StringAnagram
 {
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st String :");
        String str1 = sc.nextLine(); 

        System.out.println("Enter 2nd String :");
        String str2 = sc.nextLine();

        if (areAnagram(str1, str2))
        {  
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    public static boolean areAnagram(String str1, String str2)
   {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Remove spaces
        str1 = str1.replaceAll("\\s+", "");
        str2 = str2.replaceAll("\\s+", "");

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
}