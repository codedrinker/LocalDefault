package local.regext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by codedrinker on 7/29/16.
 */
public class RegexTest {
    public static void main(String[] args) {
        String text = "errorCode:ABC,errorMsg:说的csdfasdf你哈,";
        System.out.println(extractErrorCode(text));
        System.out.println(extractErrorMsg(text));
    }

    public static String extractErrorCode(String text) {
        String pattern = "errorCode:(\\w+),";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(text);
        if (m.find()) {
            return m.group(1);
        } else {
            return null;
        }
    }

    public static String extractErrorMsg(String text) {
        String pattern = "errorMsg:(.+),";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(text);
        if (m.find()) {
            return m.group(1);
        } else {
            return null;
        }
    }
}
