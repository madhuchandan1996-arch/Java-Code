package Basics;
import java.util.Arrays;

public class StringArrayAnagram
{
    public static void main(String[] args)
    {
        String a = "north";
        String b = "thorn";

        if(a.length() != b.length())
        {
            System.out.println("They are not Anagram");
        }
        else
        {
            // Step 1: Convert string to char array
            char[] c1 = a.toCharArray();
            char[] c2 = b.toCharArray();

            System.out.println("Converting String into Array ->");
            System.out.println(Arrays.toString(c1));
            System.out.println(Arrays.toString(c2));

            // Step 2: Sort the arrays
            Arrays.sort(c1);
            Arrays.sort(c2);

            System.out.println("After Sorting the result is ->");
            System.out.println(Arrays.toString(c1));
            System.out.println(Arrays.toString(c2));

            // Step 3: Compare both arrays
            if(Arrays.equals(c1, c2))
            {
                System.out.println("The given 2 Strings Are Anagram");
            }
            else
            {
                System.out.println("The given 2 Strings Are NOT Anagram");
            }
        }
    }
}
