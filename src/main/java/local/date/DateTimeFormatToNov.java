package local.date;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

import java.util.Locale;

/**
 * Created by codedrinker on 12/2/16.
 */
public class DateTimeFormatToNov {
    public static void main(String[] args) {
        DateTime dateTime = new DateTime();
        for (int i = 0; i < 7; i++) {
            String m = DateTimeFormat.forPattern("MMM d").withLocale(Locale.US).print(dateTime.minusDays(i));
            System.out.println(m);
        }
    }
}
