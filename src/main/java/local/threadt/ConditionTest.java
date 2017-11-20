package local.threadt;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by codedrinker on 20/11/2017.
 */
public class ConditionTest {
    public static void main(String[] args) {
        final ReentrantLock lock = new ReentrantLock();
        final Condition condition = lock.newCondition();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    System.out.println(Thread.currentThread().getName() + " run");
                    System.out.println(Thread.currentThread().getName() + " wait for condition");
                    try {
                        condition.await();
                        System.out.println(Thread.currentThread().getName() + " continue");
                    } catch (InterruptedException e) {
                        System.err.println(Thread.currentThread().getName() + " interrupted");
                        Thread.currentThread().interrupt();
                    }
                } finally {
                    lock.unlock();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    System.out.println(Thread.currentThread().getName() + " run");
                    System.out.println(Thread.currentThread().getName() + " sleep 5 secs");
                    try {
                        Thread.sleep(5000l);
                    } catch (InterruptedException e) {
                        System.err.println(Thread.currentThread().getName() + " interrupted");
                        Thread.currentThread().interrupt();
                    }
                    condition.signalAll();
                } finally {
                    lock.unlock();
                }
            }
        });
        thread1.start();
        thread2.start();
    }

}
