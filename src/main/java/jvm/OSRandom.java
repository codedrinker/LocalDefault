package jvm;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by codedrinker on 28/12/2017.
 */
public class OSRandom {
    private static long _rand_seed = 1;

    public long random() {
  /* standard, well-known linear congruential random generator with
   * next_rand = (16807*seed) mod (2**31-1)
   * see
   * (1) "Random Number Generators: Good Ones Are Hard to Find",
   *      S.K. Park and K.W. Miller, Communications of the ACM 31:10 (Oct 1988),
   * (2) "Two Fast Implementations of the 'Minimal Standard' Random
   *     Number Generator", David G. Carta, Comm. ACM 33, 1 (Jan 1990), pp. 87-88.
  */

        long a = 16807;
        long m = 2147483647;
        long q = m / a;
        long r = m % a;

        long lo = a * (long) (_rand_seed & 0xFFFF);
        long hi = a * ((long) _rand_seed >> 16);
        lo += (hi & 0x7FFF) << 16;

        // if q overflowed, ignore the overflow and increment q
        if (lo > m) {
            lo &= m;
            ++lo;
        }
        lo += hi >> 15;

        // if (p+q) overflowed, ignore the overflow and increment (p+q)
        if (lo > m) {
            lo &= m;
            ++lo;
        }
        return _rand_seed = lo;
    }

    public static void main(String[] args) {
        Map<Long, Long> map = new HashMap<>();
        System.out.println(Integer.toHexString(1 >> 16));
        System.out.println(new OSRandom().random());
//        for (int i = 0; i < 10000000; i++) {
//            long random = new OSRandom().random();
//            System.out.println(random);
//            if (map.containsKey(random)) {
//                System.out.println(random);
//            } else {
//                map.put(random, random);
//            }
//        }
    }
}
