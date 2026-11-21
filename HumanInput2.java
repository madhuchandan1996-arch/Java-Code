package Basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HumanInput2 
{
        public static void main(String[] args) 
        {
              try
                {
                Scanner s1=new Scanner(System.in);//calling parametrized constructor
                System.out.println("Please enter the value of a:");
                int a=        s1.nextInt();
                System.out.println("Please enter the value of b:");
                int b=        s1.nextInt();
                
                int sum=a+b;
                System.out.println("The sum of the two number:");
                System.out.println(sum);
                
                s1.close();
                }
                
                catch(InputMismatchException a1)
                {
                	System.out.println("Handled the exception");
                }
        }
}