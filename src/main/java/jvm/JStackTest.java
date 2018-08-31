package jvm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by codedrinker on 24/12/2017.
 */
public class JStackTest {
    /**
     * 线程死循环演示
     */
    public static void createBusyThread() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true)   // 第41行
                    ;
            }
        }, "testBusyThread");
        thread.start();
    }

    /**
     * 线程锁等待演示
     */
    public static void createLockThread(final Object lock) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "testLockThread");
        thread.start();
    }

    public static void main(String[] args) throws Exception {
//        Thread.sleep(30000L);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        createBusyThread();
        br.readLine();
        Object obj = new Object();
        System.out.println(obj.toString());
        System.out.println(obj.hashCode());
        System.out.println(Integer.toHexString(obj.hashCode()));
        System.out.println(System.identityHashCode(obj));
        createLockThread(obj);
    }

    public JStackTest() {
        super();
    }
}
