package Basics;

public class DateUsingForLoop
{
    public static void main(String[] args)
    {
        String input = "10 March 2026 20 53 46";

        String[] parts = input.split(" ");

        for(int i = 0; i < parts.length; i++)
        {
            if(i == 0)
            {
                System.out.println("Todays date is: " + parts[i]);
            }
            else if(i == 1)
            {
                System.out.println("Month is: " + parts[i]);
            }
            else if(i == 2)
            {
                System.out.println("Year is: " + parts[i]);
            }
            else if(i == 3)
            {
                System.out.println("Hour is: " + parts[i]);
            }
            else if(i == 4)
            {
                System.out.println("Min is: " + parts[i]);
            }
            else if(i == 5)
            {
                System.out.println("Sec is: " + parts[i]);
            }
        }
    }
}
