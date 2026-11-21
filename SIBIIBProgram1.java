package Basics;

public class SIBIIBProgram1
{
   
	SIBIIBProgram1()
	{
		System.out.println("Constructor");
	}
	static
	{
		System.out.println("SIB");
	}
	{
		System.out.println("IIB");
	}
	
	public static void main(String[] args)
	
	{
		System.out.println("Main Method");
		new SIBIIBProgram1();
	}
}
