package Basics;

import java.util.ArrayList;
import java.util.Collections;

public class LargestElement
{
 public static void main(String[] args)
{
	ArrayList <Integer> a1= new ArrayList();
	a1.add(80);
	a1.add(90);
	a1.add(70);
	a1.add(75);
	a1.add(98);
  int max=  Collections.max(a1);
  System.out.println("The Largest Element is "+max);
}
}
