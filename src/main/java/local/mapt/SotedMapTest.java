package local.mapt;

import org.apache.commons.collections.map.ListOrderedMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by codedrinker on 11/15/16.
 */
public class SotedMapTest {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put(2,2);
        map.put(1,1);
        System.out.println(map);

        Map<Integer,Integer> order = new ListOrderedMap();
        order.put(2,2);
        order.put(1,1);
    }
}
