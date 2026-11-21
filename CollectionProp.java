package Basics;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionProp
{
 
	public static void main(String[] args)
	{
		Collection<Double> c1= new ArrayList<Double>(); //upcasting
		c1.add(45.9);
		c1.add(17.34);
		c1.add(10.63);
		c1.add(5.67);
		c1.add(45.45);
		System.out.println(c1);
		
		c1.addAll(c1);
		c1.clear();
        c1.contains(1l);
        c1.containsAll(c1);
        c1.equals(c1);
        c1.isEmpty();
        c1.iterator();
        c1.remove(c1);
        c1.removeAll(c1);
        c1.size();
        

		
	}
}
