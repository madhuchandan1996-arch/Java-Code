package Basics;

public class StringSplitExample
{
    public static void main(String[] args)
    {
        String input = "Java Selenium Manual Testing";

        String[] c1 = input.split(" ");

        for(int i = 0; i < c1.length; i++)
        {
            System.out.println(c1[i]);
        }
    }
}
