package local.guava;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codedrinker on 9/2/16.
 */
public class PartitiomTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList() {{
            this.add("a");
            this.add("b");
            this.add("c");
            this.add("d");
            this.add("e");
            this.add("f");
            this.add("g");
            this.add("h");
            this.add("i");
        }};
        System.out.println(list);

        List<List<String>> partition = Lists.partition(list, 3);
        for (List<String> p : partition) {
            System.out.println(p);
        }
    }
}
