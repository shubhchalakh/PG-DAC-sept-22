import java.util.*;
interface Shape
{
	
	int x=1; 
	int area(int a,int b);  
	
}

class Circle implements Shape{
	
	public int area(int a,int b){
		
		return (int)3.14*(x*x);
	}
}

class Rectangle implements Shape{
	
	public int area(int l,int b){
		
		return x*b;
	}
}

class ShapeDemo
{
	
	public static void main(String args[])
	{
		Shape c1 =new Circle();
		Shape r1 =new Rectangle();
		System.out.println("Circle "+ c1.area(5,6));
		System.out.println("Rectangle "+ r1.area(5,6));
		
	}
	
}

