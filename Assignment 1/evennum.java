import java.util.Scanner;

 class evennum{
   public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the endpoint number :");
        int num = sc.nextInt();
		System.out.println("Even numbers from 1 to "+num+" are: ");
			    for (int i = 2; i <= num;i+=2 ) {
	  	System.out.println(i);
		
	   }
	}
   
   }