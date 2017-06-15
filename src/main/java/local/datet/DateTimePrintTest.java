package local.datet;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

/**
 * Created by codedrinker on 15/06/2017.
 */
public class DateTimePrintTest
{
    public static void main(String[] args) {
        String pattern = "E MMM d HH:mm:ss Z yyyy";
        String print = DateTimeFormat.forPattern(pattern).print(new DateTime());
        System.out.println(print);
    }
}
