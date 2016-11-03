package local.arraylist;

import java.util.Arrays;
import java.util.List;

/**
 * Created by codedrinker on 10/29/16.
 */
public class ArrayToList {
    public static void main(String[] args) {
        String[] array = new String[]{"hello", "world"};
        List<String> list = Arrays.asList(array);
        System.out.println(array);
        System.out.println(list);
    }
}
