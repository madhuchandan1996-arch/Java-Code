package Basics;

import java.util.HashMap;
import java.util.Map;

public class MapInterface2
{
 public static void main(String[] args)
{
	 Map<Integer,String> m1= new HashMap<Integer,String>();
	 m1.put(7485, "Ram");
	 m1.put(7496, "Sham");
	 m1.put(7435, "Bheem");
	 m1.put(7445, "Arjun");
     m1.put(7465, "Vaibhav");
     System.out.println(m1);
     
     Map<Integer,String> m2= new HashMap<Integer,String>();
	 m2.put(7420, "Ani");
	 m2.put(9636, "Akshay");
	 m2.put(2314, "Arati");
	 m2.put(6320, "Pooja");
     m2.put(7896, "Nithesh");
     System.out.println(m2);
   boolean b1=  m1.equals(m2);
   System.out.println(b1);
   
   m1.putAll(m2);  //addall
   
   m1.remove(7485);
   m1.remove(7445, "Arjun");
   
   System.out.println(m1);
     
     
	 
	 
}
}
