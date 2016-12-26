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
        System.out.println();

        System.out.println(BooleanUtils.isFalse(true));
        System.out.println(BooleanUtils.isFalse(false));
        System.out.println(BooleanUtils.isFalse(null));
        System.out.println();

        System.out.println(BooleanUtils.isNotTrue(true));
        System.out.println(BooleanUtils.isNotTrue(false));
        System.out.println(BooleanUtils.isNotTrue(null));
        System.out.println();

        System.out.println(BooleanUtils.isNotFalse(true));
        System.out.println(BooleanUtils.isNotFalse(false));
        System.out.println(BooleanUtils.isNotFalse(null));

    }
}
