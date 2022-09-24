import java.util.Scanner;

public class reversenum 
{
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
		int x,sum = 0;
        while(num != 0)
        {
            x = num % 10;
            sum = sum * 10 + x;
            num = num / 10;
        }
        System.out.println("Reverse of number:"+sum);
    }
}