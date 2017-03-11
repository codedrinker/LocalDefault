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
        String date = "2016-07-15T02:34:27+0000";
        DateTimeFormatter df = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ssZ");
        DateTime dateTime = df.withZone(DateTimeZone.forID("Etc/GMT+0")).parseDateTime(date);
        long millis = dateTime.getMillis();
        System.out.println(millis);
    }
}
