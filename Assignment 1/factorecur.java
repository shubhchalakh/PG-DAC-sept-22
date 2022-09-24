import java.util.Scanner;
public class factorecur
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number for factorial = ");
int num=sc.nextInt();
long factorial = factor(num);
System.out.println(" Factorial of " + num + " = " + factorial);
}
public static long factor(int num)
{
if (num > 1)
return num * factor(num-1);
else
return 1;
}
}
