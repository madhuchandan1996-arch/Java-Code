package Basics;

interface Parent14
{
    void method1();
}

interface Parent15
{
    void method2();
}

interface Parent16
{
    void method3();
}

interface Parent17
{
    void method4();
}

public class Child14 implements Parent14, Parent15, Parent16, Parent17
{
    public void method1()
    {
        System.out.println("Method from Parent1");
    }

    public void method2()
    {
        System.out.println("Method from Parent2");
    }

    public void method3()
    {
        System.out.println("Method from Parent3");
    }

    public void method4()
    {
        System.out.println("Method from Parent4");
    }

    public static void main(String[] args)
    {
        Child14 obj = new Child14();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
    }
}
