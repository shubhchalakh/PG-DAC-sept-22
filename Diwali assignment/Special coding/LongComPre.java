import java.util.*;
 
public class LongComPre
{
    public String longestCommonPrefix(String[] a)
    {
        int size = a.length;
 
     
        if (size == 0)
            return "";
 
        if (size == 1)
            return a[0];
 
     
        Arrays.sort(a);
 
     
        int end = Math.min(a[0].length(), a[size-1].length());
 
      
        int i = 0;
        while (i < end && a[0].charAt(i) == a[size-1].charAt(i) )
            i++;
 
        String pre = a[0].substring(0, i);
        return pre;
    }
 
  
    public static void main(String[] args)
    {
        LongComPre g1 = new LongComPre();
		Scanner sc=new Scanner(System.in);
		String a =sc.next();
		String b =sc.next();
		String c =sc.next();
		String[] input = {a,b,c};

		//String[] input = {"a", "b", "c"};
		//String[] input = {"colorado", "color", "cold"};
       
        System.out.println( "The longest Common Prefix is : \"" +g1.longestCommonPrefix(input)+"\"");
    }
}