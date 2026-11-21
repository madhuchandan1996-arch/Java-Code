package Basics;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetProperties1
{
 public static void main(String[] args)
{
	Set s1=new HashSet();
	s1.add("ramya");
	s1.add("Swathi");
	s1.add("Utkarsha");
	s1.add("Sandhya");

	
      Collections.sort(s1);
	System.out.println(s1);
}
}
