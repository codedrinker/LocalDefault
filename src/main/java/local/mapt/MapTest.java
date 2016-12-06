package local.mapt;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by codedrinker on 11/13/16.
 */
public class MapTest {
    public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap<>();
        Object out = map.put(2, 2);
        Object out1 = map.put(2, 3);
        Object out2 = map.put(2, 4);
        System.out.println(out);
        System.out.println(out1);
        System.out.println(out2);
        Map map1 = Collections.synchronizedMap(new HashMap());

        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        System.out.println(list);
        ArrayList<Object> arrayList = new ArrayList<>(list);
        System.out.println(arrayList);

        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.add(2);
        System.out.println(copyOnWriteArrayList);

        List<Object> objectList = Collections.synchronizedList(list);
        Collection<Object> objectCollection = Collections.synchronizedCollection(list);
    }
}
