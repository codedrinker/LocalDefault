import org.apache.commons.lang.time.DateUtils;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by clwang on 2/1/16.
 */
public class DateUtilsTest {
    public static void main(String[] args) {
        Date today = new Date();
        System.out.println(today);

        Date truncatedDate = DateUtils.truncate(today, Calendar.DAY_OF_MONTH);

        System.out.println(truncatedDate);

        Date truncate = DateUtils.truncate(DateUtils.addDays(today, 1), Calendar.DAY_OF_MONTH);
        System.out.println(truncate);
    }
}
