package local.arrayt;

import java.util.Arrays;

/**
 * Created by codedrinker on 20/11/2017.
 */
public class ArrayIncTest {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int i = 0;
        System.out.println(i);
        arr[i++] = 3;
        System.out.println(Arrays.toString(arr));
        System.out.println(i);
    }
}
