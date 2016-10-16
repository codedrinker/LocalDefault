package local.singleton;

import java.util.Random;

/**
 * Created by codedrinker on 10/16/16.
 */
public class SingleTon {
    public static void main(String[] args) {
        Single instance = Single.getInstance();
        System.out.println(instance.getI());
        Single single = Single.getInstance();
        System.out.println(single.getI());
    }
}

class Single {

    private int i = 0;

    private static Single single;

    private Single() {
        i = new Random().nextInt(200);
    }

    public int getI() {
        return i;
    }

    public static Single getInstance() {
        if (single == null) {
            single = new Single();
        }
        return single;
    }
}
