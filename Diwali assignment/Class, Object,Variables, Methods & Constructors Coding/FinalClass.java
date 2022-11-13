import java.util.*;
final class FinalClass{ //cannot inherit
	
	final int a=5; //can not change 
	
	final void add(){ // overloading possible but overriding not
	
		//a=10;//error
	}
	void add(int a){
		
	}
	public static void main(String args[]){
		FinalClass obj=new FinalClass();
		//obj.a=50; //error
		
	}
}
