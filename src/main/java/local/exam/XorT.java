package local.exam;

/**
 * Created by codedrinker on 9/21/16.
 */
public class XorT {
    public static void main(String[] args) {
        int n = 10000;
        int m = 1000;
        long start = System.currentTimeMillis();
        int[] a = new int[n];
        for (int k = 0; k < 10000; k++) {
            a[k] = k;
        }


        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if ((a[i] ^ a[j]) > m) {
                    count++;
                }
            }
        }
        System.out.println(count);
        System.out.println(System.currentTimeMillis() - start);
    }
}
