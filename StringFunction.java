package Basics;

import java.util.Arrays;

public class StringFunction
{

	public static void main(String[] args)
	{
		String input="kv no 1";
		char[] c1=  input.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		for(int i=0; i<input.length(); i++)
		{
			boolean b1= Character.isAlphabetic(c1[i]);
	//		System.out.println(b1);
		}
		for(int i=0;i<input.length();i++)
		{
			boolean b2=Character.isDigit(c1[i]);
			System.out.println(b2);
		}
	
	


	}
}
