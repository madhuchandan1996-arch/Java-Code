package Basics;
import java.util.Date;

public class DateCurrentTime2
{
    public static void main(String[] args)
    {
        Date d1 = new Date();
        System.out.println(d1.getTime());

        // Past time (5 days before)
        Date d2 = new Date(d1.getTime() - (1000L*60*60*24*5));
        System.out.println(d2);

        String s1 = d2.toString();

        String month = s1.substring(4,7);
        String date = s1.substring(8,10);
        String year = s1.substring(s1.length()-4);

        String format1 = date.concat(month).concat(year);
        System.out.println(format1);

        String format2 = date.concat("-").concat(month).concat("-").concat(year);
        System.out.println(format2);

        String format3 = date.concat("/").concat(month).concat("/").concat(year);
        System.out.println(format3);
    }
}
