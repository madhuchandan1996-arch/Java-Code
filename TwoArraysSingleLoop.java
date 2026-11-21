package Basics;


public class TwoArraysSingleLoop
{
    public static void main(String[] args)
    {
        int[] numbers = {10, 20, 30, 40};
        String[] names = {"Ram", "Shyam", "Mohan", "Sita"};

        for(int i = 0; i < numbers.length; i++)
        {
            System.out.println("Number: " + numbers[i] + "  Name: " + names[i]);
        }
    }
}
