package local.hashcode;

/**
 * Created by codedrinker on 3/27/16.
 */
public class StringTest {
    public static void main(String[] args) {

        String a = "h";
        String b = new String("h");
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
