import java.util.Scanner;
 
 class factors{
 
 public static void main(String args[] ){
 
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number "); 
 int num= sc.nextInt();
  System.out.println("Factors of "+num +" are"); 
 for(int n=1;n<num;n++){
 if(num%n==0){
 System.out.println(n);
  }
} 
 }
   }