package local.datet;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateTimeConvertDifferentString2SameDate {
    String patterns[] = new String[]{
            "MM/dd/yy HH:mm:ss",
            "yy/MM/dd HH:mm:ss",
            "MM/dd/yy HH:mm:ss",
            "yyyy-MM-dd HH:mm:ss"};

    public DateTime parse(String str) {
        for (String pattern : patterns) {
            try {
                DateTimeFormatter dtf = DateTimeFormat.forPattern(pattern);
                return dtf.parseDateTime(str);
            } catch (Exception e) {
                continue;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String dateStrings[] = new String[]{
                "4/23/15 10:20:33",
                "15/04/23 10:20:33",
                "04/23/15 10:20:33",
                "2015-04-23 10:20:33"
        };
        for (String str : dateStrings) {
            DateTime parse = new DateTimeConvertDifferentString2SameDate().parse(str);
            System.out.println(parse);
        }
    }
}
