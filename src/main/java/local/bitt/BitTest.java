package local.bitt;

/**
 * Created by codedrinker on 13/11/2017.
 */
public class BitTest {
    public static void main(String[] args) {
        int i = 10;
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));
        int b = i >> 1;
        System.out.println(b);
        System.out.println(Integer.toBinaryString(b));
        int c = i >>> 1;
        System.out.println(c);
        System.out.println(Integer.toBinaryString(c));
        i = -10;
        int d = i >>> 1;
        System.out.println(d);
        System.out.println(Integer.toBinaryString(d));
        i = -10;
        int e = i >> 1;
        System.out.println(e);
        System.out.println(Integer.toBinaryString(e));
    }
}
