package local.booleant;

import org.apache.commons.lang.BooleanUtils;

/**
 * Created by codedrinker on 11/30/16.
 */
public class BooleanValueOfTest {
    public static void main(String[] args) {
        Boolean b = null;
        System.out.println(b);

        boolean aTrue = BooleanUtils.isFalse(b);
        System.out.println(aTrue);


    }
}
