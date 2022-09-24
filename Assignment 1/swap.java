import java.util.Scanner;

class swap{

public static void main(String agrs[]){
Scanner sc=new Scanner(System.in);
 System.out.println("Enter two numbers "); 
 int num1= sc.nextInt();
 int num2= sc.nextInt();

System.out.println("Entered numbers are num1 = " +num1+ " and num2 = " +num2);
num1=num1+num2;
num2=num1-num2;
num1=num1-num2;

System.out.println("Numbers after swapping are num1 = " +num1+ "and num2 = " +num2 );

}}