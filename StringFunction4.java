package Basics;
import java.lang.String;
import java.lang.StringBuffer;
import java.lang.StringBuilder;

public class StringFunction4
{
 public static void main(String[] args)
{
	String a="Automation"; //String pool area-Strings are immutable
	 String b =  a.concat("Testing");
	    System.out.println(b);
	    
	    
	    StringBuffer s1=new StringBuffer("Java");
	    s1.append("Selenium");
	    System.out.println(s1);
	    
	    StringBuilder s2=new StringBuilder("Python");
	    s2.append("Selenium");
	    System.out.println(s2);
	 
	 
}
	
	
	
	
}
