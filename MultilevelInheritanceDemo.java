package Basics;
class GrandParent
{
    void show()
    {
        System.out.println("This is GrandParent class");
    }
}

class Parent extends GrandParent
{
    // Method Overloading
    void show(int a)
    {
        System.out.println("This is Parent class: a = " + a);
    }
}

class Child extends Parent
{
    // Method Overloading
    void show(int a, int b)
    {
        System.out.println("This is Child class: a = " + a + ", b = " + b);
    }
}

public class MultilevelInheritanceDemo
{
    public static void main(String[] args)
    {
        Child obj = new Child();

        obj.show();          // From GrandParent
        obj.show(10);        // From Parent
        obj.show(10, 20);    // From Child
    }
}