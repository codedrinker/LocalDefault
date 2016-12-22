package local.date;

import org.joda.time.DateTime;

/**
 * Created by codedrinker on 12/22/16.
 */
public class DateTimeMinusTest {
    public static void main(String[] args) {
        DateTime dateTime = new DateTime();
        System.out.println(dateTime);
        DateTime dateTime1 = dateTime.minusDays(1);
        System.out.println(dateTime);
        System.out.println(dateTime1);
    }
}
