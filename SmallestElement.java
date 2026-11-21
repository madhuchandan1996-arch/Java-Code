package Basics;

import java.util.ArrayList;
import java.util.Collections;

public class SmallestElement
{
 public static void main(String[] args)
{
	ArrayList<Integer> a1 =new ArrayList();
	a1.add(80);
	a1.add(65);
	a1.add(35);
	a1.add(95);
	a1.add(42);

  int minimum=Collections.min(a1);
  System.out.println("The smallest element is "+minimum);
}
}
