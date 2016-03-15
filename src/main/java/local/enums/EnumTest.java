package local.enums;

/**
 * Created by codedrinker on 3/11/16.
 */
public class EnumTest {
    public static void main(String[] args) {
        System.out.println(WEEKLY.FRI.name());
        System.out.println(WEEKLY.FRI);
        WEEKLY[] x = new WEEKLY[1];
        System.out.println(x.toString());
        System.out.println(x.length);
    }
}

enum WEEKLY {
    MON, TUS, WED, THU, FRI, SAT, SUN;

    @Override
    public String toString() {
        return "WEEKLY" + this.name();
    }
}
