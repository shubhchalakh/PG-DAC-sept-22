import java.lang.*;
import java.util.*;

class TreeSetIteration{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		TreeSet<String> l1 = new TreeSet<String>();
		
		l1.add("Red");
		l1.add("Blue");
		l1.add("Black");
		l1.add("Brown");
		l1.add("Yellow");
		l1.add("Orange");
		
		System.out.println("Tree Set is : ");
		for(String x : l1){
			
			System.out.print(x+" ");
		}
		
		
	}
}