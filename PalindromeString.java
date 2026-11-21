package Basics;

public class PalindromeString
{

	public static void main(String[] args)
	{
		String input="malayalam";
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
		   char c1=  input.charAt(i);
		   output=output+c1;
		}
		System.out.println("The given string input is:"+input);
		System.out.println("The given string output is:"+output);

		if(input.equalsIgnoreCase(output))
		{
			System.out.println("The given string is a Palindrome");
		}
		else
		{
			System.out.println("The given string is not a Palindrome");
		}
	}
}
