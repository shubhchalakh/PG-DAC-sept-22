import java.util.Scanner;
 
 
 class palindrome{
 
 public static void main(String args[])
 {
  Scanner sc= new Scanner(System.in);
  
  System.out.println("Enter the number ");
  
  int num=sc.nextInt();
  
  int n,reverse=0;
  
  n=num;
   while(n!=0)
{
 reverse=reverse*10;
reverse=reverse+n%10;
n=n/10;
}

if(num==reverse){
System.out.println("Entered number is palindrome ");
}

else{
System.out.println("Entered number is not a palindrome ");}

}}