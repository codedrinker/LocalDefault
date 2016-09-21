package local.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by codedrinker on 9/21/16.
 */
public class Xor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(s.nextInt());
        }

        long start = System.currentTimeMillis();

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    continue;
                }
                if ((list.get(i) ^ list.get(j)) > m) {
                    count++;
                }
            }
        }
        System.out.println(count / 2);
        System.out.println(System.currentTimeMillis() - start);
    }
}
