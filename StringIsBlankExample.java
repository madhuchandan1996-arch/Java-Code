package Basics;

public class StringIsBlankExample
{
    public static void main(String[] args)
    {
        String input = "  ";

        if(input.isBlank())
        {
            System.out.println("String is Blank");
        }
        else
        {
            System.out.println("String is not Blank");
        }
    }
}