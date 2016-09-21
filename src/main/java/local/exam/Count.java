package local.exam;

import java.util.*;

/**
 * Created by codedrinker on 9/21/16.
 */
public class Count {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        Long[] num = new Long[size];
        int k = 0;
        while (s.hasNext()) {
            num[k++] = s.nextLong();
        }
        List<Obj> array = new ArrayList<Obj>(num.length);
        for (int i = 0; i < num.length; i++) {
            Obj o = new Obj();
            o.s = String.valueOf(i);
            o.t = num[i];
            array.add(o);
        }
        Collections.sort(array, new Comparator<Obj>() {
            @Override
            public int compare(Obj o1, Obj o2) {
                return o1.t.compareTo(o2.t);
            }
        });
        int count = 0;
        for (int j = 0; j + 1 < array.size(); j++) {
            if (array.get(j + 1).t - array.get(j).t <= 10) {
                continue;
            } else if (array.get(j + 1).t - array.get(j).t <= 20) {
                count += 1;
            } else if (array.get(j + 1).t - array.get(j).t <= 30) {
                count += 2;
            }
        }
        count = count + array.size() % 3;
        System.out.println(count);
    }

    static class Obj {
        String s;
        Long t;
    }
}
