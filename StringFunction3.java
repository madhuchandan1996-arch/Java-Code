package Basics;

public class StringFunction3
{
 public static void main(String[] args)
{
	String a="Java"; //String pool area
	String b="Java";
    boolean b1=	a.equals(a);
    System.out.println(b1);
    System.out.println(a==b);
	 
	 String d=new String("Java"); //heap memory
	 boolean b2=a.equals(d);
	 System.out.println(b2);
	 System.out.println(a==d);
	 
	 
	 
	 
}
	
	
	
	
	
	
}
