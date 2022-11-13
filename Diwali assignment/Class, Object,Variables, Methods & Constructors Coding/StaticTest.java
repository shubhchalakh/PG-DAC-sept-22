import java.lang.*;
import java.util.*;
class StaticTest{
	int a;
	int b;
	
	void add(){
		
		System.out.println("Addition of two instance Number is : " + (a+b));
	}
	public static void main(String args[]){
		Test obj=new Test();
		System.out.println("Before initialize instance variable ");
		obj.add();
		obj.a=5;
		obj.b=15;
		System.out.println("After initialize instance variable ");
		obj.add();
		
	}
}


