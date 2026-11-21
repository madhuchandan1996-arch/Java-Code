package Basics;
import java.util.Arrays;

public class ReverseArray
{
        public static void main(String[] args) 
        {
        
                int [] input=new int[4];//human input at run time
                input[0]=20;
                input[1]=25;
                input[2]=30;
                input[3]=35;

                int [] output=new int[input.length];

                for(int i=0;i<output.length;i++)
                {
                        output[i]=input[input.length-1-i];
                }

                System.out.print("Your input Array is:");
                System.out.println(Arrays.toString(input));
                System.out.print("Your output Array is:");
                System.out.println(Arrays.toString(output));
                
        }
}