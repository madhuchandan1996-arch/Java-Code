package Basics;

import java.util.ArrayList;

public class ArrayListProgram4
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
 // a2.addAll(a1);
	a2.addAll(0,a1);
System.out.println(a2);

}
}
