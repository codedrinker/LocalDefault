package local.arraylistt;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by codedrinker on 4/12/16.
 */
public class ArrayListAsList {
    public static void main(String[] args) {
        List<String> objects = Lists.newArrayList();
        objects.add("hello");
        objects.add("word");
        objects.add("hello");
        System.out.println(objects);

        objects.remove("hello");
        System.out.println(objects);


        String strs = "a,b,c,d,a";
        List<String> strings = Arrays.asList(strs.split(","));
        HashSet<String> strings1 = new HashSet<String>(strings);
        System.out.println(strings);
        System.out.println(strings1);
    }
}
