package Basics;

import java.util.HashMap;
import java.util.Map;

public class MapInterface4
{
 public static void main(String[] args)
{
	 Map<Character,String> m1= new HashMap<Character,String>();
	 m1.put('A', "Apple");
	 m1.put('B', "Ball");
	 m1.put('C', "Cat");
	 m1.put('D', "Dog");
	 m1.put('E', "Elephant");
	 System.out.println(m1);

}
}
