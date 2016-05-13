package local.timezone;

import java.util.Date;

/**
 * Created by codedrinker on 5/13/16.
 */
public class UTCTest {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        System.out.println(l);
        Date date = new Date(l);
        System.out.println(date);
    }

}
