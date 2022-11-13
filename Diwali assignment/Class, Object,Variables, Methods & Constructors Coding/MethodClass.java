import java.util.*;
class MethodClass{
	
	int add(int a,int b){
		//Provide reusibility of the code
		return a+b;
	}
	public static void main(String args[]){
		MethodClass obj =new MethodClass();
		System.out.println(obj.add(5,10));
		System.out.println(obj.add(15,20));//Dont write code again
		
	}
}

