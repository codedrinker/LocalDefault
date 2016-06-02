package local.timezone;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codedrinker on 5/13/16.
 */

public class JodaTimeTest {
    @Test
    public void test() {
        DateTimeZone dateTimeZone = DateTimeZone.forID("America/New_York");
        DateTime dateTime = new DateTime(dateTimeZone);
        System.out.println(dateTime.getHourOfDay());

        String s = "America/New_York".replace("/", "_").toLowerCase();
        System.out.println(s);
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

    @Test
    public void testAmerica_Fort_Nelson() {
        DateTimeZone dateTimeZone = DateTimeZone.forID("America/Fort_Nelson");
        DateTime dateTime = new DateTime(dateTimeZone);
        System.out.println(dateTime.getHourOfDay());
    }

    @Test
    public void test_offset() {
        DateTimeZone dateTimeZone = DateTimeZone.forID("Asia/Shanghai");
        int offset = dateTimeZone.getOffset(System.currentTimeMillis());
        System.out.println(offset / 3600000);
    }

    @Test
    public void test_offset2() {
        List<String> timezones = new ArrayList();


        timezones.add("Etc/GMT+12");
        timezones.add("Etc/GMT+11");
        timezones.add("Etc/GMT+10");
        timezones.add("Etc/GMT+9");
        timezones.add("Etc/GMT+8");
        timezones.add("Etc/GMT+7");
        timezones.add("Etc/GMT+6");
        timezones.add("Etc/GMT+5");
        timezones.add("Etc/GMT+4");
        timezones.add("Etc/GMT+3");
        timezones.add("Etc/GMT+2");
        timezones.add("Etc/GMT+1");
        timezones.add("Etc/GMT+0");
        timezones.add("Etc/GMT-1");
        timezones.add("Etc/GMT-2");
        timezones.add("Etc/GMT-3");
        timezones.add("Etc/GMT-4");
        timezones.add("Etc/GMT-5");
        timezones.add("Etc/GMT-6");
        timezones.add("Etc/GMT-7");
        timezones.add("Etc/GMT-8");
        timezones.add("Etc/GMT-9");
        timezones.add("Etc/GMT-10");
        timezones.add("Etc/GMT-11");
        timezones.add("Etc/GMT-12");
        timezones.add("Etc/GMT-13");
        timezones.add("Etc/GMT-14");

        for (String timezoneId : timezones) {
            DateTimeZone dateTimeZone = DateTimeZone.forID(timezoneId);
//            int offset = dateTimeZone.getOffset(System.currentTimeMillis());
            System.out.print(timezoneId+"----"+new DateTime(dateTimeZone).getHourOfDay());
            String dtStr = DateTimeFormat.forPattern("yyyyMMdd hh:mm:ss").print(new DateTime(dateTimeZone));
            System.out.println(dtStr);
//            System.out.print(hourOfDay);
//            System.out.print("**");
//            System.out.println(offset / 3600000);
        }
    }
}
