package Basics;

class ConcreteClass
{
    void method1()
    {
        System.out.println("Concrete method 1 from ConcreteClass");
    }

    void method2()
    {
        System.out.println("Concrete method 2 from ConcreteClass");
    }
}

abstract class AbstractClass extends ConcreteClass
{
    void method3()
    {
        System.out.println("Concrete method from AbstractClass");
    }

    abstract void method4();   // abstract method
}

public class DerivedClass extends AbstractClass
{
    void method4()
    {
        System.out.println("Abstract method implemented in DerivedClass");
    }

    public static void main(String[] args)
    {
        DerivedClass obj = new DerivedClass();

        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
    }
}
