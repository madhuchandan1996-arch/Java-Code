package Basics;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface7
{
 public static void main(String[] args)
{
	 Map<String,Integer> m1= new HashMap<String,Integer>();
	m1.put("Maths", 94);
	m1.put("Science", 96);
	m1.put("English", 85);
	m1.put("Hindi", 79);
	m1.put("Social", 74);
	System.out.println(m1);
	Set<Entry<String,Integer>>   s2=  m1.entrySet();
	
	Iterator<Entry<String,Integer>>i2  =s2.iterator();
	while(i2.hasNext())
	{
		System.out.println(i2.next());
	}
	
   
 
}
}
