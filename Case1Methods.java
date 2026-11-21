package Basics;
public class Case1Methods
{
  public   static void method1()
     {
    	 System.out.println("Access 1");
     }
	protected static void method2()
	{
   	 System.out.println("Access 2");

	}
	static void method3()
	{
   	 System.out.println("Access 3");

	}
	private static void method4()
	{
   	 System.out.println("Access 4");

	}
	public static void main(String[] args)
	{
		
		method1();
		method2();
		method3();
		method4();
}
}
