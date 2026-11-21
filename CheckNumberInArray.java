package Basics;
public class CheckNumberInArray
{
    public static void main(String[] args)
    {
        int numberToCheck = 100;

        int array1[] = new int[5];
        array1[0] = 78;
        array1[1] = 452;
        array1[2] = 100;
        array1[3] = 985;
        array1[4] = 650;

        for(int i = 0; i < array1.length; i++)
        {
            if(numberToCheck == array1[i])
            {
                System.out.println("Yes the given value is a part of the array");
                System.out.println("At the index position -> " + i);
            }
        }
    }
}
