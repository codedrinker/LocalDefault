package local.arraylistt;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codedrinker on 11/15/16.
 */
public class ArrayListRemove {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList() {{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
            add(7);
        }};
        System.out.println(list);

        for (int i = 0; i <= list.size() - 1; i++) {
            Integer integer = list.get(i);
            if (integer == 3 || integer == 4 || integer == 5) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
