package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by clwang on 2/1/16.
 */
public class CollectionSortTest {
    public static void main(String[] args) {
        List<User> list = new ArrayList();
        list.add(new User("clwang1", 1));
        list.add(new User("clwang9", 9));
        list.add(new User("clwang7", 7));


//        Collections.sort(list);
        Collections.sort(list, new Comparator<User>() {
            public int compare(User o1, User o2) {
                return o2.getPriority() - o1.getPriority();
            }
        });
        System.out.println(list);

    }
}
