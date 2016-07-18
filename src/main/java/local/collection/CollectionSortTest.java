package local.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by clwang on 2/1/16.
 */
public class CollectionSortTest {
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
        strings.add("0.1");
        strings.add("0.1.1");
        strings.add("0.1.1.1");
        strings.add("0.1.2.1");
        strings.add("0.1.2");
        System.out.println(strings);
        Collections.sort(strings, new NativeComparator());
        System.out.println(strings);
    }
}

class NativeComparator implements Comparator<String> {
    @Override
    public int compare(String rpcId1, String o2) {
        return new CompareUtils().compare(rpcId1, o2);

    }
}

class CompareUtils {

    public int compare(String p1, String p2) {
        String[] ids1 = p1.split("\\.");
        String[] ids2 = p2.split("\\.");
        int i;
        for (i = 0; i < ids1.length && i < ids2.length; i++) {
            long lp1 = Long.parseLong(ids1[i]);
            long lp2 = Long.parseLong(ids2[i]);

            if (lp1 < lp2) {
                return -1;
            } else if (lp1 > lp2) {
                return 1;
            } else {
                continue;
            }
        }

        if (i == ids1.length && i == ids2.length) {
            return 0;
        } else if (i == ids1.length) {
            return -1;
        } else {
            return 1;
        }

    }

}
