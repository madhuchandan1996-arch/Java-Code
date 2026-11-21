package Basics;
class Parent11
{
    void display()
    {
        System.out.println("This is Parent class method");
    }
}

class Child11 extends Parent11
{
    void display()
    {
        super.display();   // calling parent class method
        System.out.println("This is Child class method");
    }

    public static void main(String[] args)
    {
        Child11 obj = new Child11();
        obj.display();
    }
}
