package local.stringt;

import org.apache.commons.lang.StringUtils;

/**
 * Created by codedrinker on 28/03/2017.
 */
public class TruncateLimitUntilLastSpace {
    public static void main(String[] args) {
        String str = "SO is greats website etc.";
        int firstIndexOfSpaceBeforeGIvenIndex = str.lastIndexOf(" ", 15);
        System.out.println(str);
        String substring = str.substring(0, firstIndexOfSpaceBeforeGIvenIndex);
        System.out.println(substring);

        String s = StringUtils.abbreviate(str, 15);
        System.out.println(s);
    }
}
