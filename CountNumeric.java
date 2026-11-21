package Basics;
public class CountNumeric
{
    public static void main(String[] args)
    {
        String input = "k v no 2 bangalore 560037";
        int countOfNumeric = 0;

        char[] c1 = input.toCharArray();

        for(int i = 0; i < c1.length; i++)
        {
            if(Character.isDigit(c1[i]))
            {
                countOfNumeric++;
            }
        }

        System.out.println("The given string is: " + input);
        System.out.println("Number of numeric digits present: " + countOfNumeric);
    }
}
