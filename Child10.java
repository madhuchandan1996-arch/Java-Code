package Basics;
class Parent8
{
    void display()
    {
        System.out.println("This is Parent class method");
    }
}

class Child8 extends Parent8
{
    void display()
    {
        System.out.println("This is Child8 class method");
    }
}

class Child9 extends Child8
{
    void display()
    {
        System.out.println("This is Child9 class method");
    }
}

public class Child10 extends Child9
{
    void display()
    {
        System.out.println("This is Child10 class method");
    }

    public static void main(String[] args)
    {
        Parent8 p = new Parent8();
        Child8 c1 = new Child8();
        Child9 c2 = new Child9();
        Child10 c3 = new Child10();

        p.display();
        c1.display();
        c2.display();
        c3.display();
    }
}