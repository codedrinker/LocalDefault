package local.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by codedrinker on 6/28/16.
 */
public class DateFormatTest {
    public static void main(String[] args) {
        String format = "yyyy-MM-dd HH:mm:ss";
        Date date = new Date();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        String formatedString = simpleDateFormat.format(date);
        System.out.println(formatedString);
    }
}
