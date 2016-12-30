package local.arraylistt;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codedrinker on 6/25/16.
 */
public class ArrayListAnonymousInstance {
    public static void main(String[] args) {
        List<String> s = new ArrayList<String>(){{
            add(new String("sh"));
        }};
        System.out.println(s);
    }
}
