package local.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by clwang on 2/2/16.
 */
public class CollectionTake2Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList() {
            {
                add(0);
                add(1);
                add(2);
            }
        };
        System.out.println(calc(list));
        list.add(3);
        System.out.println(calc(list));
        list.add(4);
        list.add(5);
        System.out.println(calc(list));
        list.add(6);
        list.add(7);
        System.out.println(calc(list));
        list.add(8);
        System.out.println(calc(list));
        list.add(9);
        System.out.println(calc(list));

    }

    public static List<Integer> calc(List<Integer> raws) {
        if (raws.size() < 4 || raws.size() % 4 == 0) {
            return raws;
        } else {
            int i = (raws.size() / 4) * 4;
            return raws.subList(0, i);
        }
    }
}
