import java.util.Scanner;
class lcm
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println(" Enter two number = ");
int num1 = sc.nextInt();
int num2 = sc.nextInt();
int gcd = 1;
for(int n=1; n<= num1 && n<= num2; ++n)
{
if(num1%n==0 && num2%n==0)
gcd = n;
}
int lcm = (num1*num2) / gcd;
System.out.println("The LCM of "+num1+" and "+num2+" is "+lcm);
}
}