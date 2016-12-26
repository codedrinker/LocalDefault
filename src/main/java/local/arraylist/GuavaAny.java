package local.arraylist;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import org.apache.commons.lang.BooleanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codedrinker on 12/26/16.
 */
public class GuavaAny {
    public static void main(String[] args) {
        List<Boolean> list = new ArrayList();
        list.add(false);
        list.add(false);
        list.add(false);
        list.add(true);
        list.add(false);
        list.add(false);
        list.add(false);
        list.add(false);
        boolean anyTrue = Iterables.any(list, new Predicate<Boolean>() {
            @Override
            public boolean apply(Boolean input) {
                return BooleanUtils.isTrue(input);
            }
        });
        System.out.println(anyTrue);
    }
}
