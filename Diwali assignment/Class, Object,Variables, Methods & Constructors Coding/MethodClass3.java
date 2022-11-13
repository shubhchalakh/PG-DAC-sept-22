import java.util.*;
class MethodClass3{
	
	void add(double a,float b){
		double a1=a;
		float b1=b;
		System.out.println("Add : "+ (a1+b1));
	}
	public static void main(String args[]){
		MethodClass3 obj =new MethodClass3();
		
		obj.add(2.5D, 1.0f);
		
	}
}

