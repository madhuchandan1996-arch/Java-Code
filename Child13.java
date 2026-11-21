package Basics;

abstract class Parent13
{
    abstract void display();   // abstract method
}

class Child13 extends Parent13
{
    void display()   // method overriding
    {
        System.out.println("Abstract method implemented in Child class");
    }

    public static void main(String[] args)
    {
        Child13 obj = new Child13();
        obj.display();
    }
}
