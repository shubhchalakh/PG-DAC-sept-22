import java.lang.*;
import java.util.*;
class SuperClass{
	int a;
	int b;
	SuperClass(int a){
		this.a=a;
	}
	int add(){
		
		return a+b;
	}
	
	
}

class SuperClassDemo extends SuperClass{
	
	SuperClassDemo(int a1,int b1){
		super(a1);
		super.b=b1;
		
		System.out.println("Addition is "+ super.add());
	}
	
	
	public static void main(String args[]){
		SuperClassDemo obj=new SuperClassDemo(11,50);
		
		System.out.println("Addition is "+ obj.add());
		
	}
}


//22. Java Program to Check the Accessibility of Static and Non-Static Variable by a Static Method

class StaticClass{
	int a=5;
	static int b=10;
	
	static void method1(){
		StaticClass obj1=new StaticClass();
		System.out.println("value of Non Static in static method A: " + obj1.a);//cannot access non static memebers
		System.out.println("value of  Static A in static method :" + b);
		
	}
	
	public static void main(String args[]){
		StaticClass obj=new StaticClass();
		System.out.println("value of Non Static A " + obj.a);
		System.out.println("value of  Static in main method B " + b);
		method1();
		
		
		
	}
}
