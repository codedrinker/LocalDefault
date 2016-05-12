package local.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by codedrinker on 4/25/16.
 */
public class ArrayTest1 {
    public static void main(String[] args) {
        String[] strings = args;
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
                System.out.println("error");
            }
        }
        for(Integer integer:list){
            System.out.print(integer);
        }
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
