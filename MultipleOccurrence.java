package Basics;
public class MultipleOccurrence
{
    public static void main(String[] args)
    {
        int numberToCheck = 40;

        int[] arr = {10, 40, 25, 40, 50, 40};

        int count = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(numberToCheck == arr[i])
            {
                System.out.println("Number found at index position -> " + i);
                count++;
            }
        }

        if(count > 1)
        {
            System.out.println("The number is present multiple times in the array");
        }
        else if(count == 1)
        {
            System.out.println("The number is present only once in the array");
        }
        else
        {
            System.out.println("The number is not present in the array");
        }
    }
}
