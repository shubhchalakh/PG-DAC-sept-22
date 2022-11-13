import java.util.*;
class HashCodeClass{
	int a=5;
	String name="YJB";
	public int hashCode(){//override
		//method present in Object Class
		//return hashcode number//(like address)//className@hashcodeValue in hexaDecimal
		//in equal method hashCode() used for comapre
		
		return a;
	}
	
	public static void main(String args[]){
		HashCodeClass obj5=new HashCodeClass();
		
		System.out.println("HashCode : "+obj5);
	}
}
