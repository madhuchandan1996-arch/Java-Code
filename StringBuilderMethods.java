package Basics;

public class StringBuilderMethods
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("Java");

        // append()
        sb.append(" Programming");
        System.out.println("After append: " + sb);

        // insert()
        sb.insert(5, "Language ");
        System.out.println("After insert: " + sb);

        // replace()
        sb.replace(5, 13, "Coding ");
        System.out.println("After replace: " + sb);

        // delete()
        sb.delete(5, 12);
        System.out.println("After delete: " + sb);

        // reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // length()
        System.out.println("Length: " + sb.length());

        // capacity()
        System.out.println("Capacity: " + sb.capacity());
    }
}
