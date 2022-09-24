import java.util.Scanner;
 
 class factorial{
 
 public static void main(String args[] ){
 
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number "); 
 int num= sc.nextInt();
 
 int factorial=1 ;
 for(int n=1;n<=num;n++){
factorial=factorial*n;
  
 }
 System.out.println("Factorial of num  " +num +" is " +factorial); 

 
   
 }
  
 }