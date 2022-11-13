import java.util.*;
class OuterClass{
	
	int add(int a,int b){
		return a+b;
	}
	class InnerClass{
		int sub(int a,int b){
		return a-b;
	}
	}
	
	public static void main(String args[]){
		OuterClass obj=new OuterClass() ;
		OuterClass.InnerClass obj1=obj.new InnerClass();
		
		System.out.println("Hello ji"+ obj.add(5,10));
	}
}
