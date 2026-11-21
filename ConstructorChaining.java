package Basics;
class ConstructorChaining
{
    ConstructorChaining()
    {
        this(10);
        System.out.println("Default constructor");
    }

    ConstructorChaining(int a)
    {
        this(10, 20);
        System.out.println("One parameter constructor: " + a);
    }

    ConstructorChaining(int a, int b)
    {
        System.out.println("Two parameter constructor: " + a + " " + b);
    }

    public static void main(String[] args)
    {
        ConstructorChaining obj = new ConstructorChaining();
    }
}
