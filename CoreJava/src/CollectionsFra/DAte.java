package CollectionsFra;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DAte {
    public static void main(String[] args) {
        System.out.println("this is a date and time class");

        Date d=new Date();
        System.out.println(d);

        long currentTime = 0;
        Time t=new Time(currentTime);
        System.out.println(t);


    }
}
