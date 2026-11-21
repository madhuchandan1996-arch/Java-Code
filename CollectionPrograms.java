package Basics;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionPrograms
{
 public static void main(String[] args)
{
	ArrayList a1=new ArrayList();
	a1.add(80);
	a1.add(90);
	a1.add(70);
	a1.add(75);
	a1.add(90);
	a1.add(1,100);
	System.out.println(a1);
	
System.out.println(Collections.max(a1));
System.out.println(Collections.min(a1));	
	Collections.sort(a1);	
	System.out.println(a1);
	Collections.reverse(a1);
	System.out.println(a1);
	System.out.println(Collections.frequency(a1, 90));
	Collections.shuffle(a1);
	System.out.println(a1);
	Collections.rotate(a1, 2);
	System.out.println(a1);
	Collections.rotate(a1, -2);

System.out.println(a1);
}
}
