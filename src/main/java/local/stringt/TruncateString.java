package local.stringt;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;

/**
 * Created by codedrinker on 29/03/2017.
 */
public class TruncateString {
    public static void main(String[] args) {
        String str = "hello";

        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            sb.append(c);
            sb.append(",");
        }
        String substring = sb.substring(0, sb.length() - 1);

        System.out.println(substring);
        String[] split = StringUtils.split(substring, ",", 10);
        System.out.println(Arrays.toString(split));
    }
}
