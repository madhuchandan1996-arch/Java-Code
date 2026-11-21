package Basics;
class Parent4
{
    Parent4()
    {
        System.out.println("Parent class constructor called");
    }
}

class Child4 extends Parent4
{
    Child4()
    {
        super(); // calls parent class constructor
        System.out.println("Child class constructor called");
    }
}

public class SuperConstructorDemo
{
    public static void main(String[] args)
    {
        Child4 obj = new Child4();
    }
}
