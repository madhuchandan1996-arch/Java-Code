package Basics;
class Parent12
{
    final void display()
    {
        System.out.println("This is Parent class final method");
    }
}

class Child12 extends Parent12
{
    // Cannot override the final method
    // void display()
    // {
    //     System.out.println("This is Child class method");
    // }
}

public class FinalKeywordDemo
{
    public static void main(String[] args)
    {
        Child12 obj = new Child12();
        obj.display();
    }
}
