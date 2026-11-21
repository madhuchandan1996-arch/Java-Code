package Basics;
public class StringFunctionsDemo
{
    public static void main(String[] args)
    {
        String str1 = "Java Programming";
        String str2 = "java programming";

        // toUpperCase()
        System.out.println("Uppercase: " + str1.toUpperCase());

        // toLowerCase()
        System.out.println("Lowercase: " + str1.toLowerCase());

        // equals()
        System.out.println("Using equals(): " + str1.equals(str2));

        // equalsIgnoreCase()
        System.out.println("Using equalsIgnoreCase(): " + str1.equalsIgnoreCase(str2));

        // contains()
        System.out.println("Contains 'Java': " + str1.contains("Java"));
    }
}
