package local.timezone;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.junit.Test;

/**
 * Created by codedrinker on 5/13/16.
 */

public class JodaTimeTest {
    @Test
    public void test() {
        DateTimeZone dateTimeZone = DateTimeZone.forID("America/New_York");
        DateTime dateTime = new DateTime(dateTimeZone);
        System.out.println(dateTime.getHourOfDay());
    }
    @Test
    public void test1() {
        DateTimeZone dateTimeZone = DateTimeZone.forID("America/Jujuy");
        DateTime dateTime = new DateTime(dateTimeZone);
        System.out.println(dateTime.getHourOfDay());
    }

    @Test
    public void test2() {
        DateTimeZone dateTimeZone = DateTimeZone.forID("Europe/Belfast");
        DateTime dateTime = new DateTime(dateTimeZone);
        System.out.println(dateTime.getHourOfDay());
    }
    @Test
    public void test3() {
        DateTimeZone dateTimeZone = DateTimeZone.forID("Asia/Shanghai");
        DateTime dateTime = new DateTime(dateTimeZone);
        System.out.println(dateTime.getHourOfDay());
    }
}
