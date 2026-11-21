package Basics;
abstract class Animal
{
    abstract void sound();   // abstract method
}

class Dog extends Animal   // concrete class
{
    void sound()
    {
        System.out.println("Dog barks");
    }
}

public class AbstractDemo
{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.sound();
    }
}