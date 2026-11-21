package Basics;

public class PrimitiveTypeCasting
{

	
	public static void main(String[] args)
	{
		int a =100;
		double b1=a;  //implicit widening
		System.out.println(b1);
		
		int b=100;
		double b2=(double)b; //explicit widening
		System.out.println(b2);
		
		//converting byte into short
		
		byte a1=100;
		short s1=a1;
		System.out.println(s1);
		
		byte b3=100;
		short s2=(short)b3;
		System.out.println(s2);
		
		
		short s3=100;
		int a3=s3;
		System.out.println(a3);
		
		short s4=50;
		int a4=(int)s4;
		System.out.println(a4);
		
		
		
	}
}
