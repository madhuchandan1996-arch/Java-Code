package Basics;
class Amazon
{
	static void loginwithmobileno()
	{
		System.out.println("Mobile no");
	}
	void registartion()
	{
		System.out.println("Registration no");
	}
}
public class Day17_2025 extends Amazon
{
	static void loginwithemailid()
	{
		System.out.println("Email ID");
	}
	void logout()
	{
		System.out.println("Logout");
	}
 public static void main(String[] args)
{
	 loginwithemailid();
	 loginwithmobileno();	 
	 Day17_2025 m1=new Day17_2025();
	 m1.registartion();
	 m1.logout();

	 
	 
}
}
