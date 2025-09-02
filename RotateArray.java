import java.util.*;
public class RotateArray
{
   public static void main(String x[])
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Array size");
    int n=sc.nextInt();
	int a[]=new int[n];
    System.out.println("enter" + n + "element");
    for(int i=0;i<a.length;i++)
    {
    a[i]=sc.nextInt();
    }
	System.out.println("Enter Rotate Array by k position");
    int k=sc.nextInt();
    k=k%n;
    int[] result = new int[n];
    for(int i=0;i<n;i++)
    {
		result[(i + k) % n] = a[i];
    }
	System.out.println("Arrays after rotation");
    System.out.println(Arrays.toString(result));

}

}

//using lambda expression
import java.util.*;
import java.util.stream.*;

public class RotateArrayOneLine {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3, n = arr.length;
        System.out.println(Arrays.toString(
            IntStream.range(0, n).map(i -> arr[(i + n - k) % n]).toArray()
        ));
    }
}




