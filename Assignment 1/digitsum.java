import java.util.Scanner;
 class digitsum{
  public static void main(String args[])
 {
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the number ");
  int num=sc.nextInt();
   int sum=0;
    System.out.println("Sum of digits of " +num +" is ");
    while( num!=0)
    {
	
    sum=sum+(num%10);
	num=num/10;
	}
	System.out.println(sum);
 }}