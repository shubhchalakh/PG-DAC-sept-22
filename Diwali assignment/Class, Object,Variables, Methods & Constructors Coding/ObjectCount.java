import java.util.*;
class ObjectCount{
	static int count;
	
	ObjectCount(){
		
		count++;
	}
	public static void main(String args[]){
		ObjectCount obj1=new ObjectCount();
		ObjectCount obj2=new ObjectCount();
		ObjectCount obj3=new ObjectCount();
		ObjectCount obj4=new ObjectCount();
		ObjectCount obj=obj4;//just refer the reference of object obj4 
		obj=obj3; //just refer the reference of object obj4
		System.out.println("Total Object Created "+count); //only 4 object created
	
	
	}
}
