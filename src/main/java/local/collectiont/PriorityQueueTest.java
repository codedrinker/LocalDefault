package local.collectiont;

import java.util.PriorityQueue;
import java.util.Random;

/**
 * Created by codedrinker on 21/11/2017.
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();
        for (int i = 0; i < 10; i++) {
            int i1 = new Random().nextInt(1000);
            priorityQueue.offer(new Customer(i1, "clwang" + i1));
        }

        priorityQueue.offer(new Customer(1, "clwang" + 1));
        priorityQueue.offer(new Customer(1, "clwang" + 1));

        Customer customer = new Customer(1, "1");
        Customer customer1 = new Customer(2, "2");
        System.out.println(customer.compareTo(customer1));

        while (priorityQueue.size() != 0) {
            System.out.println(priorityQueue.poll());
        }
    }

    static class Customer implements Comparable<Customer> {

        @Override
        public String toString() {
            return "Customer{" +
                    "rate=" + rate +
                    ", id='" + id + '\'' +
                    '}';
        }

        private Integer rate;
        private String id;

        public Customer(Integer rate, String id) {
            this.rate = rate;
            this.id = id;
        }

        public Integer getRate() {
            return rate;
        }

        public void setRate(Integer rate) {
            this.rate = rate;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        @Override
        public int compareTo(Customer o) {
            return o.getRate() - this.getRate();
        }
    }
}
