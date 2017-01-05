package local.timestampt;

import org.apache.commons.lang.StringUtils;

/**
 * Created by codedrinker on 1/5/17.
 */
public class TimestampLength {
    public static void main(String[] args) {
        long timestamp = System.currentTimeMillis();
        System.out.println(StringUtils.length(String.valueOf(timestamp)));

        long timestamp2 = Long.parseLong("201212122300");
        System.out.println(String.valueOf(timestamp2).length());
    }
}
