import java.util.Scanner;
 
 class leap{
 
 public static void main(String args[] ){
 
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the year "); 
 int year= sc.nextInt();
 if(year%400==0){
 System.out.println(+year+" is a leap year ");}
 else if(year%100==0)
 {System.out.println(+year+" is not a leap year ");}
 else if(year%4==0){
 System.out.println(+year+" is a leap year ");}
 else{
 System.out.println(+year+" is not a leap year ");}
 
 
 }}
 