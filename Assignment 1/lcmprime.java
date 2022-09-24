import java.util.Scanner;
 
 
 class lcmprime{
 
 public static void main(String args[])
 {
  Scanner sc= new Scanner(System.in);
  int lcm=1;
  System.out.println("Enter the numberS ");
    int num1=sc.nextInt();
    int num2=sc.nextInt(); 
	int n1=num1,n2=num2;
     for(int n=2; n<= n1 && n<= n2; ++n) {
         while(num1%n==0 || num2%n==0) {
        if(num1%n==0) {num1 = num1/n;}
            if(num2%n==0) {num2 = num2/n;}
         lcm=lcm*n;
      }
	 }
       System.out.println("The LCM of "+n1+" and "+n2+" is "+lcm);
     
	 
   }
}
  