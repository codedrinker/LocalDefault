package local.threadt;

/**
 * Created by codedrinker on 20/11/2017.
 */
public class WaitNotifyAllTest {
    public synchronized void doWait() {
        System.out.println(Thread.currentThread().getName() + " run");
        System.out.println(Thread.currentThread().getName() + " wait for condition");
        try {
            this.wait();
            System.out.println(Thread.currentThread().getName() + " continue");
        } catch (InterruptedException e) {
            System.err.println(Thread.currentThread().getName() + " interrupted");
            Thread.currentThread().interrupt();
        }
    }

    public synchronized void doNotify() {
        try {
            System.out.println(Thread.currentThread().getName() + " run");
            System.out.println(Thread.currentThread().getName() + " sleep 5 secs");
            Thread.sleep(5000l);
            this.notifyAll();
        } catch (InterruptedException e) {
            System.err.println(Thread.currentThread().getName() + " interrupted");
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        final WaitNotifyAllTest waitNotifyAllTest = new WaitNotifyAllTest();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                waitNotifyAllTest.doWait();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                waitNotifyAllTest.doNotify();
            }
        });
        thread1.start();
        thread2.start();
    }

}
