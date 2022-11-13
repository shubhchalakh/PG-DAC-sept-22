import java.util.*;
class Consclass TestClass{

	static int b=10;
	
	int method1(){
		
		
		return b;
	
	}

	public static void main(String args[]){
		TestClass obj=new TestClass();
		System.out.println("value b before changing :" + b);
		b=15;
		System.out.println("value of  Static after changing " + obj.method1());
		
		
		
		
	}
}

tructorChaining{
	int rollNo;
	String name;
	ConstructorChaining(){ 
		this.rollNo=10;
		   
	}
	
	ConstructorChaining(String name){ 
		this();//call default constructor 
		this.name=name;   
	}
	public static void main(String args[]){
		ConstructorChaining obj =new ConstructorChaining("YJB");
		System.out.println("Roll No : "+obj.rollNo +" name "+obj.name);
		
	}
}