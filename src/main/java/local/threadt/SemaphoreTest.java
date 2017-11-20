package local.threadt;

import java.util.Date;
import java.util.concurrent.Semaphore;

/**
 * Created by codedrinker on 20/11/2017.
 */
public class SemaphoreTest {
    private static Semaphore semaphore = new Semaphore(1);

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        semaphore.acquire();
                        System.out.println(Thread.currentThread().getName() + " " + new Date());
                        Thread.sleep(5000l);
                        semaphore.release();
                    } catch (InterruptedException e) {
                        System.err.println(Thread.currentThread().getName() + " interrupted");
                    }
                }
            }).start();
        }
    }
}
