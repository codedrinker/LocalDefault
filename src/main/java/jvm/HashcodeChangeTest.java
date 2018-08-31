package jvm;

/**
 * Created by codedrinker on 24/12/2017.
 * 使用如下配置对JVM进行配置
 * -Xms20m -Xmx20m -Xmn10m -XX:+UseSerialGC
 * 通过控制对象的大小和GC，使得对象重复创建和GC并在Eden,Survivor和Old中移动，观察hashCode的变化
 */
public class HashcodeChangeTest {

    static class HashCodeObj {
        private String name;

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        HashCodeObj obj = new HashCodeObj();

        System.out.println(Thread.currentThread().getName() +
                "-" + Thread.currentThread().hashCode() +
                "-" + obj.hashCode());
        obj.setName("name");
        new Thread(new InnerThread(obj)).start();
        new Thread(new InnerThread(obj)).start();
        System.out.println(Thread.currentThread().getName() +
                "-" + Thread.currentThread().hashCode() +
                "-" + obj.hashCode());
    }

    static class InnerThread implements Runnable {
        private Object obj;

        public InnerThread(Object object) {
            this.obj = object;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() +
                    "-" + Thread.currentThread().hashCode() +
                    "-" + obj.hashCode());
        }
    }
}
