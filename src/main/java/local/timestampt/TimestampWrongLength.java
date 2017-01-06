package local.timestampt;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/**
 * Created by codedrinker on 1/6/17.
 */
public class TimestampWrongLength {
    public static void main(String[] args) {
        DateTime dateTime = new DateTime(System.currentTimeMillis(), DateTimeZone.forID("Pacific/Pitcairn"));
        System.out.println(dateTime);
        dateTime = new DateTime(20161212121212l, DateTimeZone.forID("Pacific/Pitcairn"));
        System.out.println(dateTime);
    }
}
