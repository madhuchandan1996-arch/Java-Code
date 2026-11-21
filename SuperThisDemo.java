package Basics;
class Parent6
{
    Parent6()
    {
        System.out.println("Parent class constructor");
    }

    Parent6(int a)
    {
        System.out.println("Parent parameterized constructor: " + a);
    }
}

class Child6 extends Parent6
{
    Child6()
    {
        this(20);   // calling another constructor in same class
        System.out.println("Child default constructor");
    }

    Child6(int b)
    {
        super(10);  // calling parent parameterized constructor
        System.out.println("Child parameterized constructor: " + b);
    }
}

public class SuperThisDemo
{
    public static void main(String[] args)
    {
        Child6 obj = new Child6();
    }
}
