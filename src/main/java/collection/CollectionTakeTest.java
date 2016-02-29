package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by clwang on 2/2/16.
 */
public class CollectionTakeTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);

        System.out.println(list);
        System.out.println(list.size());
        if (list.size() >= 6) {
            List<Integer> integers = list.subList(0, 6);
            System.out.println(list);
            System.out.println(integers);
        }

    }
}
