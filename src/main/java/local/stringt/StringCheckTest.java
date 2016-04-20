package local.stringt;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codedrinker on 4/20/16.
 */
public class StringCheckTest {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList();
        stringList.add("AB");
        stringList.add("BC");
        stringList.add("CD");

        String startStr = "";
        String endStr = "";
        for (String s : stringList) {
            startStr += s.charAt(0);
            endStr += s.charAt(s.length() - 1);
        }

        System.out.println(startStr);
        String startStrWithoutHead = startStr.substring(1, startStr.length());
        System.out.println(startStrWithoutHead);


        System.out.println(endStr);
        String endStrWithoutTail = endStr.substring(0, endStr.length() - 1);
        System.out.println(endStrWithoutTail);

        System.out.println(endStrWithoutTail.equals(endStrWithoutTail));
    }
}
