package local.timezone;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import java.util.TimeZone;

/**
 * Created by codedrinker on 3/2/16.
 */
public class TimezoneTest {
    public static void main(String[] args) {
        String[] availableIDs = TimeZone.getAvailableIDs();
        for (String a : availableIDs) {
            System.out.println(DateTimeZone.forID(a).getOffset(new DateTime()));
        }
    }

}
