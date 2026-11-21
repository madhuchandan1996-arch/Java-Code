package Basics;

abstract class Shape
{
    abstract void area();   // abstract method
}

class Circle extends Shape
{
    int radius = 5;

    void area()
    {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

public class ShapeAreaDemo
{
    public static void main(String[] args)
    {
        Circle c = new Circle();
        c.area();
    }
}
