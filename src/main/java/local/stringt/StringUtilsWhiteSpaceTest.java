package local.stringt;

import org.apache.commons.lang.StringUtils;

/**
 * Created by codedrinker on 4/9/16.
 */
public class StringUtilsWhiteSpaceTest {
    public static void main(String[] args) {
        String str = " white space";
        String prefix = "p";
        System.out.println(prefix + str);
        String s = StringUtils.deleteWhitespace(str);
        System.out.println(prefix + s);
    }
}
