package Basics;
public class CountSpecialCharacters
{
    public static void main(String[] args)
    {
        String input = "k v no@ 2 bangalore#";
        int countOfSpecial = 0;

        char[] c1 = input.toCharArray();

        for(int i = 0; i < c1.length; i++)
        {
            if(!Character.isAlphabetic(c1[i]) && 
               !Character.isDigit(c1[i]) && 
               !Character.isWhitespace(c1[i]))
            {
                countOfSpecial++;
            }
        }

        System.out.println("The given string is: " + input);
        System.out.println("Number of special characters present: " + countOfSpecial);
    }
}
