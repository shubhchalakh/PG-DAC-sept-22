import java.util.*;
class SwapObject{
	
	SwapObject obj3;
	void swap(Object obj1,Object obj2){
		
		System.out.println("Before Swapping Object 1 :"+ obj1);
		System.out.println("Before Swapping Object 2 :"+obj2);
		
		
		SwapObject obj3=(SwapObject)obj1;
		obj1=(SwapObject)obj2;
		obj2=(SwapObject)obj3;
		
		System.out.println("After Swapping Object 1 :"+ obj1);
		System.out.println("After Swapping Object 2 :"+obj2);
	}
	public static void main(String args[]){
		SwapObject obj1=new SwapObject();
		SwapObject obj2=new SwapObject();
		obj2.swap(obj1,obj2);
		
		
		
	}
}