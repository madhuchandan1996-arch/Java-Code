package Basics;
class ParentType
{
	
}
public class ClassType1 extends ParentType
{
 
	
	public static void main(String[] args)
	{
		ParentType P1=new ClassType1();
		ClassType1 C1=(ClassType1)P1; //Downcasting explicitely
		
		
		
	}
}
