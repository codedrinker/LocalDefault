package local.arraylistt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(){{
            this.add("good");
            this.add("bad");
        }};
        Collections.shuffle(list);
        System.out.println(list.get(0));
        Collections.shuffle(list);
        System.out.println(list.get(0));
        Collections.shuffle(list);
        System.out.println(list.get(0));
    }
}
