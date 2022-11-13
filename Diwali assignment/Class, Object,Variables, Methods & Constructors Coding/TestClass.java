import java.util.*;
class TestClass{

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

