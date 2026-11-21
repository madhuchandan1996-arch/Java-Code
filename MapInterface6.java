package Basics;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface6
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
	
   // Set<String> s1=	m1.keySet(); // can iterate all the keys only
	//Collection<Integer>c1=m1.values(); //can iterate only the values
	// Set<Entry<String,Integer>> kv=m1.entrySet(); // can iterate both pair of values

	for( String s1: m1.keySet())
	{
		System.out.println(s1);
	}
	for(Integer i1 : m1.values()  )
	{
		System.out.println(i1);
	}
    for(Entry<String,Integer> i2 : m1.entrySet())
    {
    	System.out.println(i2);
    }
 
}
}
