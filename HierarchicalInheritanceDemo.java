package Basics;
class BaseClass
{
    void display()
    {
        System.out.println("This is BaseClass (Parent)");
    }
}

class ChildOne extends BaseClass
{
    void show()
    {
        System.out.println("This is ChildOne class");
    }
}

class ChildTwo extends BaseClass
{
    void print()
    {
        System.out.println("This is ChildTwo class");
    }
}

public class HierarchicalInheritanceDemo
{
    public static void main(String[] args)
    {
        ChildOne obj1 = new ChildOne();
        obj1.display(); // Parent method
        obj1.show();    // ChildOne method

        ChildTwo obj2 = new ChildTwo();
        obj2.display(); // Parent method
        obj2.print();   // ChildTwo method
    }
}
