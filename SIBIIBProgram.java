package Basics;

public class SIBIIBProgram
{
 SIBIIBProgram()     //Constructor
 {
	 System.out.println("Constructor 1");
 }
 SIBIIBProgram(int a)
 {
	 System.out.println("Constructor 2");
 }
	static                //SIB
	{
		System.out.println("SIB");
	}
	
	{           //IIB
		System.out.println("IIB");
	}
	
	public static void main(String[] args)
	{
		new SIBIIBProgram();
		new SIBIIBProgram(100);
		System.out.println("Main Method");
		
		
	}
	
	
	
	
	
	
	
	
}
