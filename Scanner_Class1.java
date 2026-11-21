package Basics;

import java.util.Scanner;

public class Scanner_Class1
{

	public static void main(String[] args)
	{
		
		//let us do addition of two numbers
		Scanner s1=new Scanner(System.in);
		System.out.println("Pls enter the value of a");
        int a=s1.nextInt();		         
        System.out.println("Pls enter the value of b");
        int b=s1.nextInt();
        
        int sum=a+b;
        int sub=a-b;
        int mul=a*b;
        int div=a/b;
        int mod=a%b;


        System.out.println("The sum of the two nuumber are "+sum);
        System.out.println("The substraction of the two nuumber are "+sub);
        System.out.println("The multiplication of the  two nuumber are "+mul);
        System.out.println("The division of the two nuumber are "+div);
        System.out.println("The modulus of the two nuumber are "+mod);

	}
}
