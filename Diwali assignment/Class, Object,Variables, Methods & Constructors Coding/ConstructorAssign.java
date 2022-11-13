import java.lang.*;
import java.util.*;
class ConstructorAssign{
	
	int rollNo;
	String name;
	
	ConstructorAssign(int rollNo, String name){
		this.rollNo=rollNo;
		this.name=name;
		
	}
	void get(){
		
		System.out.println("Roll No "+ rollNo);
		System.out.println("Name "+ name);
	}
	public static void main(String args[]){
		ConstructorAssign obj=new ConstructorAssign(100,"YJB");
		obj.get();
		
	}
}
