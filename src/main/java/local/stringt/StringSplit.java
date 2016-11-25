package local.stringt;

/**
 * Created by codedrinker on 11/25/16.
 */
public class StringSplit {
    public static void main(String[] args) {
        String s = "aaaa";
        System.out.println(s.split("_").length);
        String[] split = s.split("_");
        for (String str : split) {
            System.out.println(str);
        }
    }
}
