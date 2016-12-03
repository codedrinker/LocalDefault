package local.arraylist;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by codedrinker on 4/12/16.
 */
public class ArrayListSublistTest {
    public static void main(String[] args) {
        List<String> objects = Lists.newArrayList();
        objects.add("1");
        objects.add("2");
        objects.add("3");
        objects.add("4");
        objects.add("5");
        objects.add("6");
        objects.add("7");
        System.out.println(objects);

        if (objects.size() > 6) {
            objects = objects.subList(0, 6);
        } else if (objects.size() > 3) {
            objects = objects.subList(0, 3);
        } else {
            objects = Lists.newArrayList();
        }

        System.out.println(objects);
    }
}
