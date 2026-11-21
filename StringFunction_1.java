package Basics;

public class StringFunction_1
{

	public static void main(String[] args)
	{
		String a="My name is Ramu";
		String b="   My name is Ramu    ";
		System.out.println(a.trim());
		System.out.println(b.trim());

		String name1="AbhiShek";
		String name2="abhishek";
		System.out.println(name1.equals(name2));  
		System.out.println(name1.concat(" Kumar Tiwari"));
		System.out.println(name1.equalsIgnoreCase(name2));
	}
}
