package local.fort;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codedrinker on 09/05/2017.
 */
public class ForContinueTest {
    public static void main(String[] args) {
        List<Integer> outers = new ArrayList<>();
        outers.add(1);
        outers.add(2);
        outers.add(3);

        List<Integer> firstInners = new ArrayList<>();
        firstInners.add(1);
        firstInners.add(2);
        firstInners.add(3);

        List<Integer> secondInners = new ArrayList<>();
        secondInners.add(1);
        secondInners.add(2);
        secondInners.add(3);

        for (Integer outer : outers) {
            for (Integer firstInner : firstInners) {
                if (firstInner.equals(outer)) {
                    System.out.println("first inner find" + firstInner);
                    break;
                }
                System.out.println("first inner loop");
            }
            for (Integer secondInner : secondInners) {
                if (secondInner.equals(outer)) {
                    System.out.println("second inner find" + secondInner);
                    break;
                }
                System.out.println("second inner loop");
            }
        }
    }
}
