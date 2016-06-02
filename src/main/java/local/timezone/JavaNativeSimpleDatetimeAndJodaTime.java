package local.timezone;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by codedrinker on 6/2/16.
 */
public class JavaNativeSimpleDatetimeAndJodaTime {
    @Test
    public void convert_to_string_in_different_timezone_by_java_sdf() {
        String format = "yyyy-MM-dd HH:mm:ss";
        //使用这种方式拿到的时间的毫秒是不对的,他是根据系统的timezone变化的,如果timezone切换了这个时间也是跟着变化的
        try {
//            1464869410000
//            1464887410000
            Date parse = new SimpleDateFormat(format).parse("2016-06-02 20:10:10");
            System.out.println(parse.getTime());

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void convert_to_string_in_different_timezone_by_joda_time() {
        String format = "yyyy-MM-dd HH:mm:ss";
        DateTimeFormatter fmt = DateTimeFormat.forPattern(format);
        DateTime dateTime = fmt.parseDateTime("2016-06-02 20:10:10");
        new DateTime();
        //1464869410000
        //1464887410000
        long millis = dateTime.getMillis();
        System.out.println(millis);

    }

    @Test
    public void convert_to_string_in_different_timezone_by_java_sdf_succeed() {
        String format = "yyyy-MM-dd HH:mm:ss";
        //使用这种方式拿到的时间的毫秒是不对的,他是根据系统的timezone变化的,如果timezone切换了这个时间也是跟着变化的
        try {
//            1464869410000
//
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
            Date parse = simpleDateFormat.parse("2016-06-02 20:10:10");
            System.out.println(parse.getTime());

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void convert_to_string_in_different_timezone_by_joda_time_succeed() {
        String format = "yyyy-MM-dd HH:mm:ss";
        DateTimeFormatter fmt = DateTimeFormat.forPattern(format);
        DateTime dateTime = fmt.parseDateTime("2016-06-02 20:10:10");
        new DateTime();
        //1464869410000
        //1464887410000
        long millis = dateTime.getMillis();
        System.out.println(millis);

    }
}
