package local.lang;

/**
 * Created by codedrinker on 10/30/16.
 */
public class IntegerTest {
    public static void main(String[] args) {
        int compare = Integer.compare(1, 3);
        System.out.println(compare);

        String s= "0x15";
        String s2= "010";
        Integer decode = Integer.decode(s);
        System.out.println(decode);
        Integer integer = new Integer(3);
        double v = integer.doubleValue();
        System.out.println(v);

        int i = Integer.parseInt(s2);
        int i2= Integer.parseInt(s2,2);
        System.out.println(i2);

        System.out.println(Integer.reverse(1));
        System.out.println(Integer.valueOf("1").byteValue());

        String s1 = Integer.toBinaryString(3);
        System.out.println(s1);
        int i1 = Integer.parseInt(s1);
        System.out.println(i1);

        System.out.println(Integer.parseInt(s1,2));

    }
}
