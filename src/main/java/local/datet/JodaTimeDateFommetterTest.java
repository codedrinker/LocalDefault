package local.datet;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Created by codedrinker on 7/15/16.
 */
public class JodaTimeDateFommetterTest {
    public static void main(String[] args) {
        String date = "Sat Apr 02 14:42:59 +0800 2011";
//        String date = "2016-07-15T02:34:27+0000";//yyyy-MM-dd'T'HH:mm:ssZ
        DateTimeFormatter df = DateTimeFormat.forPattern("E MMM d HH:mm:ss Z yyyy");
        DateTime dateTime = df.withZone(DateTimeZone.forID("Etc/GMT+0")).parseDateTime(date);
        System.out.println(dateTime);
//        long millis = dateTime.getMillis();
//        System.out.println(millis);
    }
}
