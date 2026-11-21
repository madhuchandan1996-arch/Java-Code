package Basics;

interface Interface1
{
    void method1();
}

interface Interface2 extends Interface1
{
    void method2();
}

public class InterfaceRelationDemo implements Interface2
{
    public void method1()
    {
        System.out.println("Method1 from Interface1");
    }

    public void method2()
    {
        System.out.println("Method2 from Interface2");
    }

    public static void main(String[] args)
    {
        InterfaceRelationDemo obj = new InterfaceRelationDemo();
        obj.method1();
        obj.method2();
    }
}
