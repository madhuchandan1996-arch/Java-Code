package Basics;

public class This_Keyword
{
	
	int age;  //0
	String name; //null
	double salary; //0.0
	void details(int age,String name,double salary)
	{
		
		this.age=age; //this.global_variable=local variable;
		this.name=name;
		this.salary=salary;
	}
	
	
	
  public static void main(String[] args)
{
	  This_Keyword t1=new This_Keyword();
	  t1.details(45, "Madhu", 8574.32);
	  System.out.println(t1.age);
	  System.out.println(t1.name);
	  System.out.println(t1.salary);

	  
}
}
