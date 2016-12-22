package local.arraylist;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by codedrinker on 12/12/16.
 */
public class ArrayList {
    public int secondMax(Integer[] array) {
        List<Integer> list = Arrays.asList(array);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return o2 - o1;
            }
        });
        return list.get(1);
    }

    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3,4,5};
        System.out.println(new ArrayList().secondMax(integers));
    }
}

