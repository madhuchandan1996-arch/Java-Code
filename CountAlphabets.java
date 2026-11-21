package Basics;
public class CountAlphabets
{
    public static void main(String[] args)
    {
        String input = "k v no 2 bangalore";
        int countOfAlpha = 0;

        char[] c1 = input.toCharArray();

        for(int i = 0; i < c1.length; i++)
        {
            if(Character.isAlphabetic(c1[i]))
            {
                countOfAlpha++;
            }
        }

        System.out.println("The given string is: " + input);
        System.out.println("Number of alphabets present: " + countOfAlpha);
    }
}