package local.threadt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by codedrinker on 9/9/16.
 */
public class ThreadPoolTest {
    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 100, 5, TimeUnit.MINUTES, new LinkedBlockingQueue<Runnable>(10), new ThreadPoolExecutor.CallerRunsPolicy());


    class ThreadCountPrinter implements Runnable {
        public ThreadCountPrinter(int count) {
            this.count = count;
        }

        private int count;
        @Override
        public void run() {

            Executors.newCachedThreadPool();
            Collections.synchronizedSet(new HashSet());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " count: " + count);
        }
    }

    public void run() {
        List list = new ArrayList();
        for (int i = 0; i < 400; i++) {
            threadPoolExecutor.submit(new ThreadCountPrinter(i));
        }
    }

    public static void main(String[] args) {
        new ThreadPoolTest().run();
    }
}
