package local.datet;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

/**
 * Created by codedrinker on 01/08/2017.
 */
public class TimestampOutofdate {
    public static void main(String[] args) {
        String date = "20381231";
        String format = "yyyyMMdd";
        DateTime dateTime = DateTimeFormat.forPattern(format).parseDateTime(date);
        ;
        System.out.println(dateTime);
        System.out.println(dateTime.getMillis());
        long millis = DateTimeFormat.forPattern(format).parseDateTime("19701212").getMillis();
        System.out.println(millis);
        System.out.println(dateTime.getMillis() - millis);
        DateTime dateTime1 = new DateTime(4294967295L * 1000);
        System.out.println(dateTime1);
        DateTime dateTime2 = new DateTime(4294967296L * 1000 / 2);
        System.out.println(dateTime2);
    }
}
