package Basics;
public class StringOnlyConsitOfAlphabet
{
    static int countOfALpha = 0;
    public static void main(String[] args)
    {
        String input = "school";
        char[] c1 = input.toCharArray();

        for(int i = 0; i < input.length(); i++)
        {
            boolean b1 = Character.isAlphabetic(c1[i]);

            if(b1 == true)
            {
                countOfALpha++;
            }
        }

        System.out.println(countOfALpha);
        if(countOfALpha == input.length())
        {
            System.out.println("String consist of only alphabets");
        }
        else
        {
            System.out.println("Not just alphabet");
        }
    }
}
