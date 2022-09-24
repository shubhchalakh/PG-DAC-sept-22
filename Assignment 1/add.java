import java.util.Scanner;
class add 
{ 
 	public static void main(String[] args) 
 	{ 
 	 	Scanner sc = new Scanner(System.in);  	 	
		System.out.println(" Enter numbers to be added = ");  
	 	int a = sc.nextInt(); 
 	 	int b = sc.nextInt(); 
        int c=a;		
	 	for(int i = 1; i <= b; i++) 
           	 	c++; 
 	 	System.out.println("Sum of "+a+" and "+b+" = "+c); 
 	} 	 
 	
} 
