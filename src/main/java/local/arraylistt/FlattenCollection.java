package local.arraylistt;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenCollection {
    public static void main(String[] args) {
        List<List<Integer>> wrapList = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        first.add(2);

        List<Integer> second = new ArrayList<>();
        second.add(3);
        second.add(4);

        wrapList.add(first);
        wrapList.add(second);

        System.out.println(wrapList);

        //JDK7
        List<Integer> result1 = Lists.newArrayList(Iterables.concat(wrapList));//flatten list
        System.out.println(result1);
        Integer max1 = Collections.max(result1);//max element
        System.out.println(max1);

        //JDK8
        List<Integer> result2 = wrapList.stream().flatMap(List::stream).collect(Collectors.toList());//flatten list
        System.out.println(result2);
        Integer max2 = result2.stream().max((o1, o2) -> o1 - o2).get();//max element
        System.out.println(max2);
    }
}
