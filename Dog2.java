package Basics;
interface Animal2
{
    void sound();   // abstract method in interface
}
abstract class Mammal implements Animal2
{
    void eat()
    {
        System.out.println("Mammal eats food");
    }
}
public class Dog2 extends Mammal
{
    public void sound()
    {
        System.out.println("Dog barks");
    }

    public static void main(String[] args)
    {
        Dog2 d = new Dog2();
        d.eat();
        d.sound();
    }
}
