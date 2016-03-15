package local.timezone;

import java.util.Date;

/**
 * Created by codedrinker on 3/2/16.
 */
public class TimezoneTest {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(1457777216000L);
        System.out.println(new Date(System.currentTimeMillis()));
        System.out.println(new Date(1457777047000L));
    }

}
