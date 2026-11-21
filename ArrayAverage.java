package Basics;
import java.util.Arrays;
public class ArrayAverage
{
        public static void main(String[] args) 
        {
        //datatype [] variable=new datatype[size];
                
                double  [] array1=new double[4];
                array1[0]=20;
                array1[1]=31;
                array1[2]=30;
                array1[3]=20;
                double sum=0;
                
                for(int i=0;i<=array1.length-1;i++)
                {
                 sum=sum+array1[i];
                 
                }
                 System.out.println(sum);

                 double average=sum/array1.length;
                 
                 System.out.println("The average of all the values in the given Array is-> "+average);
                
                
        }
}
