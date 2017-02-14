package local.collectiont;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

import java.util.ArrayList;

/**
 * Created by codedrinker on 3/4/16.
 */
public class JoinerTest {
    public static void main(String[] args) {
        ArrayList<Integer> integers = Lists.newArrayList(1, 2, 3, 4);
        System.out.println(integers);
        Joiner on = Joiner.on(",");
        System.out.println(on);
        String join = on.join(integers);
        System.out.println(join);

        Iterable<String> split = Splitter.on(",").split(join);
        System.out.println(split);


    }
}
