package Basics;
class ThisConstructorDemo
{
    ThisConstructorDemo()
    {
        this(100);   // calling parameterized constructor
        System.out.println("Default constructor");
    }

    ThisConstructorDemo(int a)
    {
        System.out.println("Parameterized constructor value: " + a);
    }

    public static void main(String[] args)
    {
        ThisConstructorDemo obj = new ThisConstructorDemo();
    }
}