package local.threadt;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by codedrinker on 19/06/2017.
 */
public class CallableFutures {
    private static final int NTHREDS = 10;

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);
        List<Future<Long>> list = new ArrayList<Future<Long>>();
        long start = System.currentTimeMillis();

        Callable<Long> a = new MyCallableA(1);
        Callable<Long> b = new MyCallableB(2);
        Future<Long> aresult = executor.submit(a);
        Future<Long> bresult = executor.submit(b);

        try {
            Long aLong1 = bresult.get(3000, TimeUnit.MILLISECONDS);
            System.out.println(System.currentTimeMillis() - start);
            Long aLong = aresult.get(3000, TimeUnit.MILLISECONDS);
            System.out.println(System.currentTimeMillis() - start);
        } catch (Exception e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }

    public static class MyCallableA implements Callable<Long> {
        private int i;

        public MyCallableA(int i) {
            this.i = i;
        }

        @Override
        public Long call() throws Exception {
            Thread.sleep(6000);
            System.out.println("current thread index : " + i);
            return 0L;
        }

    }

    public static class MyCallableB implements Callable<Long> {
        private int i;

        public MyCallableB(int i) {
            this.i = i;
        }

        @Override
        public Long call() throws Exception {
            Thread.sleep(2000);
            System.out.println("current thread index : " + i);
            return 1l;
        }

    }
}
