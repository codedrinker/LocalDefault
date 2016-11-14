package local.threadt;

/**
 * Created by codedrinker on 11/13/16.
 */
public class RunnableTest implements Runnable {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            new Thread(new RunnableTest()).start();
        }
        for (int i = 0; i <= 100; i++) {
            new Thread(new RunnableTest().new Runnable1Test()).start();
        }

        for (int i = 0; i <= 100; i++) {
            new RunnableTest().new ThreadTest1().start();
        }

    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("b:" + Thread.currentThread().getName());
    }

    class Runnable1Test implements Runnable {

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("c:" + Thread.currentThread().getName());
        }
    }

    class ThreadTest1 extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("a:" + Thread.currentThread().getName());
        }
    }
}
