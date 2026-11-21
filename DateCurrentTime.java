package Basics;
import java.util.Date;

public class DateCurrentTime 
{
    public static void main(String[] args) 
    {
        // Current time
        Date d1 = new Date();
        System.out.println("Current Time : " + d1);

        // Past time (10 days before)
        Date past = new Date(d1.getTime() - (1000L*60*60*24*10));
        System.out.println("Past Time : " + past);

        // Future time (10 days after)
        Date future = new Date(d1.getTime() + (1000L*60*60*24*10));
        System.out.println("Future Time : " + future);
    }
}