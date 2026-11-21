package Basics;
import java.util.Arrays;

public class CopyOneArrayIntoAnother
{
        public static void main(String[] args) 
        {
        
                int [] input=new int[4];//human input at run time
                input[0]=45;
                input[1]=100;
                input[2]=40;
                input[3]=40;

                int [] output=new int[input.length];

                for(int i=0;i<output.length;i++)//output.length=4,input.length=4
                {
                   output[i]=input[i];
        
                     
                }
                System.out.print("Your input Array is:");
                System.out.println(Arrays.toString(input));
                System.out.print("Your output Array is:");
                System.out.println(Arrays.toString(output));
                
        }
}