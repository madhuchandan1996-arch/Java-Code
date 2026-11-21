package Basics;
class Parent5
{
    Parent5(int a)
    {
        System.out.println("Parent class constructor value: " + a);
    }
}

class Child5 extends Parent5
{
    Child5()
    {
        super(10);   // calling parent parameterized constructor
        System.out.println("Child class constructor");
    }
}

public class SuperParameterizedDemo
{
    public static void main(String[] args)
    {
        Child5 obj = new Child5();
    }
}