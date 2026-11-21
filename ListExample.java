package Basics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExample
{
    public static void main(String[] args)
    {
        List<Integer> l1 = new ArrayList<>();
        l1.add(98);
        l1.add(63);
        l1.add(0);
        l1.add(35);
        l1.add(876);
        l1.add(342);
        l1.add(342);
        l1.add(342);

        Collections.sort(l1);

        System.out.println("Sorted List: " + l1);

        // Forward Iteration using Iterator
        System.out.println("\nForward Iteration using Iterator:");
        Iterator<Integer> i2 = l1.iterator();
        while(i2.hasNext())
        {
            System.out.println(i2.next());
        }

        // Forward Iteration using ListIterator
        System.out.println("\nForward Iteration using ListIterator:");
        ListIterator<Integer> i4 = l1.listIterator();
        while(i4.hasNext())
        {
            System.out.println(i4.next());
        }

        // Backward Iteration using ListIterator
        System.out.println("\nBackward Iteration using ListIterator:");
        ListIterator<Integer> i5 = l1.listIterator(l1.size());
        while(i5.hasPrevious())
        {
            System.out.println(i5.previous());
        }
    }
}