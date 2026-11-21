package Basics;

import java.util.ArrayList;

public class ArrayListProgram5
{
public static void main(String[] args)
{
	ArrayList<Integer> a1=new ArrayList<Integer>();
	a1.add(80);
	a1.add(90);
	a1.add(70);
	a1.add(75);
	a1.add(98);
	System.out.println(a1);
	
	ArrayList<Integer> a2=new ArrayList<Integer>();
	a2.add(4);
	a2.add(5);
	a2.add(7);
	a2.add(7);
	a2.add(9);
	System.out.println(a2);
  boolean b1= a1.equals(a2);
  System.out.println(b1);
  a1.clear();
  boolean b2= a1.isEmpty();
  System.out.println(b2);
System.out.println(a1);

}
}
