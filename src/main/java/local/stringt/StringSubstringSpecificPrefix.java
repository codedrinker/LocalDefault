package local.stringt;

/**
 * Created by codedrinker on 17/02/2017.
 */
public class StringSubstringSpecificPrefix {
    public static void main(String[] args) {
        String prefix = "12345";
        String suffix = "67890";
        String combine = prefix + suffix;
        System.out.println(combine);
        String handle = combine.substring(prefix.length());
        System.out.println(handle);
    }
}
