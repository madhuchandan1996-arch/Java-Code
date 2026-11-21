package Basics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection3
{
    public static void main(String[] args)
    {
        // Using Generics (Best Practice)
        Collection<Object> c1 = new ArrayList<>();

        c1.add("Age");
        c1.add("Colour");
        c1.add(76);
        c1.add(false);
        c1.add(6.98);
        System.out.println(c1);
        
    Collection c2= new ArrayList();           
    c2.add("Sugar");
    c2.add("Age");
     Iterator i1=  c1.iterator();
    while(i1.hasNext())
    	{
    	  System.out.println(i1.next());
    	}
      int b1=c1.size();
         System.out.println(b1);
        boolean b2= c1.contains("Manish");
        System.out.println(b2);
        
      boolean b3=     c1.containsAll(c2);
      System.out.println(b3);
         
     
    }
}