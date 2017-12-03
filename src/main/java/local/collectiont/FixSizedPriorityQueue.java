package local.collectiont;

import java.util.PriorityQueue;

/**
 * Created by codedrinker on 21/11/2017.
 */
public class FixSizedPriorityQueue<E extends Comparable> {
    private PriorityQueue queue;
    private int size;

    public FixSizedPriorityQueue(int size) {
        this.size = size;
        queue = new PriorityQueue(size);
    }

    public void add(E e) {
        if (queue.size() + 1 <= size) {
            queue.add(e);
        } else {
            E peek = (E) queue.peek();
            if (peek != null && peek.compareTo(e) < 0) {
                queue.poll();
                queue.add(e);
            }
        }
    }

    public void topK() {
        while (queue.size() != 0) {
            E poll = (E) queue.poll();
            System.out.println(poll);
        }
    }

    public static void main(String[] args) {
        FixSizedPriorityQueue<User> userFixSizedPriorityQueue = new FixSizedPriorityQueue<>(10);
        for (int i = 0; i <= 300; i++) {
            User user = new User(i, i + "");
            System.out.println(user);
            userFixSizedPriorityQueue.add(user);
        }
        System.out.println("======");
        userFixSizedPriorityQueue.topK();
    }

    static class User implements Comparable<User> {
        public int rate;
        public String name;

        @Override
        public int compareTo(User o) {
            return this.rate - o.rate;
        }

        public User(int rate, String name) {
            this.rate = rate;
            this.name = name;
        }

        @Override
        public String toString() {
            return "User{" +
                    "rate=" + rate +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}