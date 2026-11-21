package Basics;

import java.util.HashMap;
import java.util.Map;

public class MapInterface5
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
	 
     boolean b1=  m1.isEmpty();
     System.out.println(b1);
//     m1.clear();
      System.out.println(m1);

    boolean b2=  m1.containsKey(7466);
       System.out.println(b2);
       
     boolean b3=  m1.containsValue("Ram");
     System.out.println(b3);
	 
     m1.replace(7465, "Vaibhav","Sunita");
     System.out.println(m1);
     
     m1.replace(7485, "Ram","Vishnu");
     System.out.println(m1);
}
}
