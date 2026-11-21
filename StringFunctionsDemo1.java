package Basics;

public class StringFunctionsDemo1
{
    public static void main(String[] args)
    {
        String str = "automation";

        // substring(index)
        System.out.println("Substring from index 4: " + str.substring(4));

        // substring(index, endIndex)
        System.out.println("Substring from index 2 to 6: " + str.substring(2,6));

        // reverse()
        StringBuffer sb = new StringBuffer(str);
        System.out.println("Reverse of string: " + sb.reverse());
    }
}
