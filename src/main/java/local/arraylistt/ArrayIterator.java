package local.arraylistt;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by codedrinker on 4/25/16.
 */
public class ArrayIterator {
    public static void main(String[] args) {
        String[] strings = {"1", "3", "5", "2", "4", "6", "7", "8"};
        List<Integer> list = new ArrayList();
        for (String str : strings) {
            if (isNumeric(str)) {
                Integer integer = Integer.valueOf(str);
                if (list.size() == 0) {
                    list.add(integer);
                } else {
                    if (integer > list.get(list.size() - 1)) {
                        list.add(integer);
                    }
                }
            } else {
                System.out.println(str + " is not integer");
            }
        }
        System.out.println("size:" + list.size());
        System.out.println("list is:" + list);
    }

    public static boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(str);
        if (!isNum.matches()) {
            return false;
        }
        return true;
    }
}
