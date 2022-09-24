import java.util.Scanner;
 class digits{
  public static void main(String args[])
 {
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the number ");
  int num=sc.nextInt();
   
    System.out.println("Digits of " +num +" are ");
    while( num!=0)
    {
	int c=num%10;
	System.out.println(c);
	num=num/10;
	}
 }}