package local.stringt;

/**
 * Created by codedrinker on 10/25/16.
 */
public class StringFormat {
    public static void main(String[] args) {
        String str = "/topics/%s%s_tz_%s";
        System.out.println(String.format(str, null,"1","2"));
        System.out.println(String.format(str, "","1","2"));
    }

}
