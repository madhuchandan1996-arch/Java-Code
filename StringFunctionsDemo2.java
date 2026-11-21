package Basics;
public class StringFunctionsDemo2
{
    public static void main(String[] args)
    {
        String str = "Java Programming";

        // matches()
        System.out.println("Matches 'Java Programming': " + str.matches("Java Programming"));

        // replace(char a, char b)
        String r1 = str.replace('a', 'o');
        System.out.println("After replace(char,char): " + r1);

        // replace(CharSequence a, CharSequence b)
        String r2 = str.replace("Java", "Python");
        System.out.println("After replace(CharSequence,CharSequence): " + r2);

        // replaceAll(String regex, String replacement)
        String r3 = str.replaceAll("a", "@");
        System.out.println("After replaceAll(): " + r3);
    }
}
