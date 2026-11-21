package Basics;

interface A
{
    void display();
}

interface B extends A
{
	
}

interface C extends A
{
	
}

class D implements B, C
{
    public void display()
    {
        System.out.println("Diamond problem solved using Interface");
    }

    public static void main(String[] args)
    {
        D obj = new D();
        obj.display();
    }
}
