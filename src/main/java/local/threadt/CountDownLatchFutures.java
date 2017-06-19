package local.threadt;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by codedrinker on 19/06/2017.
 */
public class CountDownLatchFutures {
    private static final int NTHREDS = 10;

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);
        CountDownLatch countDownLatch = new CountDownLatch(5);
        List<Future<Long>> list = new ArrayList<Future<Long>>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5; i++) {
            Callable<Long> worker = new MyCallable(i, countDownLatch);
            Future<Long> submit = executor.submit(worker);
            list.add(submit);
        }
        long sum = 0;
        System.out.println(list.size());
        // now retrieve the result
        for (Future<Long> future : list) {
            try {
                sum += future.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(sum);
        System.out.println(System.currentTimeMillis() - start);
        executor.shutdown();
    }

    public static class MyCallable implements Callable<Long> {
        private int i;
        private CountDownLatch countDownLatch;

        public MyCallable(int i) {
            this.i = i;
        }

        public MyCallable(int i, CountDownLatch countDownLatch) {
            this.i = i;
            this.countDownLatch = countDownLatch;
        }

        @Override
        public Long call() throws Exception {
            Thread.sleep(2000);
            System.out.println("current thread index : " + i);
            long sum = 0;
            for (long i = 0; i <= 100; i++) {
                sum += i;
            }
            countDownLatch.countDown();
            return sum;
        }

    }
}
