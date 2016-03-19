package local.collection;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by codedrinker on 3/19/16.
 */
public class SubListTest {
    public static void main(String[] args) {
        List<Integer> integers = Lists.newArrayList(1, 2, 3, 4);
        System.out.println(integers);

        List<Integer> integers1 = integers.subList(0, 3);
        System.out.println(integers);
        System.out.println(integers1);


    }
}
