package local.random;

/**
 * Created by codedrinker on 3/25/16.
 */
public class RandomTest {
    public static void main(String[] args) {
        double random = Math.random();
        System.out.println(random);
        int v = (int)Math.floor(4*random);
        System.out.println(v);

    }
}
