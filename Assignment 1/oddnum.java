import java.util.Scanner;
class oddnum{
   public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the endpoint number :");
        int num = sc.nextInt();
		System.out.println("ODD numbers from 1 to "+num+" are: ");
			    for (int i = 1; i <= num;i+=2 ) {
	  	System.out.println(i);
		
	   }
	}
   
   }