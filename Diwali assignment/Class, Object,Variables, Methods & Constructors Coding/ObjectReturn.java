import java.util.*;
interface Xyz{
	Xyz method(Object x1);
}

class ObjectReturn implements Xyz{
	ObjectReturn x;
	
	
	public Xyz method(Object x1){
		
		Xyz x2=(Xyz)x1;
		return x2;
		
	}
	
	
	ObjectReturn method1(ObjectReturn y){ //Top most class is Object we can also use current class name
		x=(ObjectReturn)y;
		return x; 
	}
	
	public static void main(String args[]){
		ObjectReturn obj=new ObjectReturn();
		
		System.out.println("Return Object is method 1 ClassName@HashCode : "+ obj.method1(obj));
		System.out.println("Return Object is method ClassName@HashCode : "+ obj.method(obj));
	}
}

