package Basics;
class GrandParent1
{
    void display()
    {
        System.out.println("This is GrandParent class (non-static method)");
    }
}

class Parent1 extends GrandParent1
{
    void show()
    {
        System.out.println("This is Parent class (non-static method)");
    }
}

class Child1 extends Parent1
{
    void print()
    {
        System.out.println("This is Child class (non-static method)");
    }
}

public class MultilevelInheritanceNonStatic
{
    public static void main(String[] args)
    {
        // Creating object of Child class
        Child1 obj = new Child1();

        obj.display(); // From GrandParent
        obj.show();    // From Parent
        obj.print();   // From Child
    }
}