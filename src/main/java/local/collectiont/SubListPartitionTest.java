package local.collectiont;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by codedrinker on 3/19/16.
 */
public class SubListPartitionTest {
    public static void main(String[] args) {
        List<Integer> integers = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7);
        System.out.println(integers);

        int pageCount = integers.size() / 3;
        System.out.println(pageCount);


        List<Integer> integers1 = integers.subList(0, 3);
        System.out.println(integers);
        System.out.println(integers1);


    }
}
