package local.booleant;

import org.apache.commons.lang.BooleanUtils;

/**
 * Created by codedrinker on 11/30/16.
 */
public class BooleanValueOfTest {
    public static void main(String[] args) {
        System.out.println(BooleanUtils.isTrue(null));
        System.out.println(BooleanUtils.isTrue(false));
        System.out.println(BooleanUtils.isTrue(true));
    }
}
