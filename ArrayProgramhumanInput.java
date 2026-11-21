package Basics;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayProgramhumanInput 
{
        public static void main(String[] args) {
        //[3,5,8,1,0]        
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the size of your Array:");
        int [] rollno=new int[s1.nextInt()];
        
        for(int i=0;i<rollno.length;i++)
        {
                System.out.println("Enter the value of Array at the index position->"+ i);
                rollno[i]=s1.nextInt();
        }

        System.out.print("The Final Array is :");
        System.out.println(Arrays.toString(rollno));        }
        
        
        
        
}
