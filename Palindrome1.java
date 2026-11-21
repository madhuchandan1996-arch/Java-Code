package Basics;

public class Palindrome1
{

	public static void main(String[] args)
	{
		String input="madam";
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1= input.charAt(i);
			output=output+c1;
		}
		System.out.println(output);
		if(input.equals(output))
		{
			System.out.println("The give string is a palindrome");
		}
		else
		{
			System.out.println("The given string is not a palindrome");
		}
	}
}
