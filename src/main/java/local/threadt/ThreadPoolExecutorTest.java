package local.threadt;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by codedrinker on 23/12/2017.
 */
public class ThreadPoolExecutorTest {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 4, 10L, TimeUnit.DAYS, new LinkedBlockingDeque<Runnable>(5), new RejectedExecutionHandler() {
            @Override
            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
                System.out.println("reject");
            }
        });

        for (int i = 0; i <= 12; i++) {
            threadPoolExecutor.submit(new Task());
        }
    }

    static class Task implements Runnable {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(2000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Current Thread : " + Thread.currentThread().getName());
            }
        }
    }
}
