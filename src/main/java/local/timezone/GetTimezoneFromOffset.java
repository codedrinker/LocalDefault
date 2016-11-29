package local.timezone;

import org.joda.time.DateTimeZone;

/**
 * Created by codedrinker on 11/29/16.
 */
public class GetTimezoneFromOffset {
    public static void main(String[] args) {
        DateTimeZone dateTimeZone = DateTimeZone.forOffsetHours(8);
        System.out.println(dateTimeZone);
    }
}
