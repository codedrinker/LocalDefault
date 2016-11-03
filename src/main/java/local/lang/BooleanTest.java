package local.lang;

/**
 * Created by codedrinker on 10/30/16.
 */
public class BooleanTest {
    public static void main(String[] args) {
        Boolean b = false;
        boolean b1 = b.booleanValue();
        boolean a = Boolean.getBoolean("a");
        Boolean a1 = Boolean.valueOf("a");

        System.out.println(a1);
        System.out.println(a);

        Integer i = 1;
        int i1 = i.intValue();
        System.out.println(i1);
        String s = "1";
        Integer i2 = Integer.valueOf(s);

        System.out.println(i2);



        int compare = Boolean.compare(false, true);
        System.out.println(compare);

    }
}
