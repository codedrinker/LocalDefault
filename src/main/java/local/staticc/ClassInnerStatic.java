package local.staticc;

/**
 * Created by codedrinker on 3/24/16.
 */
public class ClassInnerStatic {
    static int i;

    static {
        i = 10;
    }

    public static void echo() {
        System.out.println(i);
    }
}
