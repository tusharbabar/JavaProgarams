import java.util.Arrays;
public class SortString 
{
    public static void main(String[] args) 
   {
        String str = "GIRITECHHUB";
        String sortedStr = sortString(str);
        System.out.println("Sorted String: " + sortedStr);
    }

    public static String sortString(String str)
 {
 
        char[] charArray = str.toCharArray();
        
        // Sort the character array
        Arrays.sort(charArray);
        
 
        return new String(charArray);
    }
}