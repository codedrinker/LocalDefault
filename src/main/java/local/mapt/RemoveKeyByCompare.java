package local.mapt;

import java.util.*;

/**
 * Created by codedrinker on 11/03/2017.
 */
public class RemoveKeyByCompare {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        map.put(10, 10);
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        map.put(5, 5);
        map.put(4, 4);
        map.put(7, 7);
        System.out.println(map);

        SortedMap<Integer, Integer> integerIntegerSortedMap = map.tailMap(3);
        System.out.println(integerIntegerSortedMap);

        map.tailMap(7, false).clear();
        System.out.println(map);

        map.headMap(2, true).clear();
        System.out.println(map);
    }
}
